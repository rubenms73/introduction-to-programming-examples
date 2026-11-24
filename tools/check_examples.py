"""Compile and run every Java example and compare its output with the expected one.

Usage, from any folder, with JDK 11 or later on PATH:
    python3 tools/check_examples.py            check every example
    python3 tools/check_examples.py --update   rewrite the expected outputs

tools/examples.txt lists each example folder with its main class, the text
typed on the keyboard and the command-line arguments. The expected outputs are
in tools/expected, one file per example. Each program is compiled on its own
for Java 11 with -Xlint:all -Werror and runs with an English locale, so decimal numbers
use a point on every machine. Two warnings are turned off on purpose: the
course overrides equals without hashCode (hashCode is left for Data
Structures), and constructors call the setters that filter the values.
"""
import re
import subprocess
import sys
import tempfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
TOOLS = ROOT / "tools"

# Parts of the output that change on every run are replaced before comparing.
MASKS = [
    (r"actual [A-Z](?:[0-9][A-Z])*[0-9]?$", "actual <random code>"),
    (r"Calculation time: \d+\.\d+ s", "Calculation time: <time> s"),
]


def mask(text):
    lines = text.replace("\r\n", "\n").split("\n")
    for pattern, replacement in MASKS:
        lines = [re.sub(pattern, replacement, line) for line in lines]
    return "\n".join(lines)


def lint_options():
    version = subprocess.run(["javac", "-version"], capture_output=True, text=True)
    major = int(re.search(r"(\d+)", version.stdout + version.stderr)[1])
    # The this-escape warning exists from JDK 21 on.
    disabled = "-overrides,-this-escape" if major >= 21 else "-overrides"
    return ["-Xlint:all," + disabled, "-Werror"]


def check(folder, main, keyboard, args, update, work, lint):
    source = ROOT / folder
    classes = work / folder
    classes.mkdir(parents=True)
    compiled = subprocess.run(
        ["javac", "--release", "11"] + lint + ["-encoding", "UTF-8",
         "-d", str(classes)] + [str(p) for p in sorted(source.glob("*.java"))],
        capture_output=True, text=True)
    if compiled.returncode != 0:
        return "does not compile\n" + compiled.stdout + compiled.stderr
    run = subprocess.run(
        ["java", "-Duser.language=en", "-Duser.country=US",
         "-Dstdout.encoding=UTF-8", "-Dsun.stdout.encoding=UTF-8",
         "-cp", str(classes), main] + args,
        input=keyboard.encode("utf-8"), capture_output=True, timeout=60)
    actual = mask(run.stdout.decode("utf-8"))
    if run.returncode != 0:
        return f"exit code {run.returncode}\n" + run.stderr.decode("utf-8")
    expected_file = TOOLS / "expected" / (folder + ".txt")
    if update:
        expected_file.parent.mkdir(parents=True, exist_ok=True)
        expected_file.write_text(actual, encoding="utf-8", newline="\n")
        return None
    if not expected_file.exists():
        return "no expected output"
    expected = expected_file.read_text(encoding="utf-8")
    if actual != expected:
        return "unexpected output\n--- expected\n" + expected + "\n--- actual\n" + actual
    return None


def main():
    update = "--update" in sys.argv
    failures = 0
    total = 0
    lint = lint_options()
    with tempfile.TemporaryDirectory() as temporary:
        for line in (TOOLS / "examples.txt").read_text(encoding="utf-8").splitlines():
            if not line.strip() or line.startswith("#"):
                continue
            fields = line.split(";") + ["", ""]
            folder, main_class = fields[0].strip(), fields[1].strip()
            # Only the space after ";" is removed: the input may need its spaces.
            keyboard = fields[2][1:] if fields[2].startswith(" ") else fields[2]
            keyboard = keyboard.replace("\\n", "\n") + "\n" if keyboard.strip() else ""
            args = fields[3].split()
            total += 1
            problem = check(folder, main_class, keyboard, args,
                            update, Path(temporary), lint)
            if problem:
                failures += 1
                print(f"FAIL {folder}: {problem}")
    print(f"{total - failures} of {total} examples passed")
    sys.exit(1 if failures else 0)


if __name__ == "__main__":
    main()
