import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Text: ");
        String text = in.nextLine();

        System.out.println(encode(text));
    }

    public static String encode(String text) {
        if (text.length() == 0) {
            return "";
        }

        String result = "";
        char current = text.charAt(0);
        int count = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == current) {
                count++;
            } else {
                result += current + String.valueOf(count);
                current = text.charAt(i);
                count = 1;
            }
        }

        result += current + String.valueOf(count);
        return result;
    }
}
