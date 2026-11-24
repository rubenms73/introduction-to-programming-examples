import java.util.Scanner;

/** Counts how many times each letter appears in a text. */
public class LetterHistogram
{
    /**
     * Reads a text and prints its histogram.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Text: ");
        String text = keyboard.nextLine();

        int[] histogram = letterHistogram(text);
        printHistogram(histogram);
        keyboard.close();
    }

    /**
     * Counts the letters of a text, ignoring case. Position 0 counts the a,
     * position 1 the b, and so on.
     *
     * @param text the text
     * @return an array of 26 counters
     */
    public static int[] letterHistogram(String text)
    {
        int[] counts = new int[26];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z')
                c = (char)(c + ('a' - 'A'));
            if (c >= 'a' && c <= 'z')
                counts[c - 'a']++;
        }

        return counts;
    }

    /**
     * Prints the letters that appear at least once and their counters.
     *
     * @param counts the 26 counters
     */
    public static void printHistogram(int[] counts)
    {
        for (int i = 0; i < counts.length; i++)
            if (counts[i] > 0)
            {
                char letter = (char)('a' + i);
                System.out.printf("%c: %d%n", letter, counts[i]);
            }
    }
}
