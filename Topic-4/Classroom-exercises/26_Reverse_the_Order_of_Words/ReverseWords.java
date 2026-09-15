import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = in.nextLine();

        System.out.println(reverseWords(sentence));
    }

    public static String reverseWords(String text) {
        String[] words = splitIntoWords(text);
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }

    public static String[] splitIntoWords(String text) {
        String[] words = new String[countWords(text)];
        int position = 0;
        int i = 0;

        while (i < text.length()) {
            while (i < text.length() && text.charAt(i) == ' ') {
                i++;
            }

            if (i < text.length()) {
                int start = i;
                while (i < text.length() && text.charAt(i) != ' ') {
                    i++;
                }
                words[position] = text.substring(start, i);
                position++;
            }
        }

        return words;
    }

    public static int countWords(String text) {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                insideWord = false;
            } else if (!insideWord) {
                count++;
                insideWord = true;
            }
        }

        return count;
    }
}
