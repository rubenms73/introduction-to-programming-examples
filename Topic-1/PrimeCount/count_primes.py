import sys
import time

MAX_LIMIT = 1_000_000_000


def count_primes(limit):
    """Count primes in [2, limit] by trying divisors up to the square root."""
    count = 0
    number = 2

    while number <= limit:
        divisor = 2
        while divisor * divisor <= number and number % divisor != 0:
            divisor += 1
        if divisor * divisor > number:
            count += 1
        number += 1
    return count


def main():
    try:
        if len(sys.argv) == 1:
            text = input(f"Upper limit (0..{MAX_LIMIT}): ")
        elif len(sys.argv) == 2:
            text = sys.argv[1]
        else:
            raise ValueError
        limit = int(text)
        if limit < 0 or limit > MAX_LIMIT:
            raise ValueError
    except (ValueError, EOFError):
        print("Usage: python count_primes.py [limit]", file=sys.stderr)
        print(f"Enter an integer from 0 to {MAX_LIMIT}.", file=sys.stderr)
        return 1

    start = time.perf_counter()
    count = count_primes(limit)
    elapsed = time.perf_counter() - start

    print(f"Primes up to {limit}: {count}")
    print(f"Elapsed time: {elapsed:.6f} s")
    return 0


if __name__ == "__main__":
    sys.exit(main())
