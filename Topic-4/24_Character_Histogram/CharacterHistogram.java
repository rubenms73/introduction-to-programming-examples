import java.util.Scanner;

public class CharacterHistogram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Text: ");
        String text = in.nextLine();

        int[] histogram = letterHistogram(text);
        printHistogram(histogram);
    }

    public static int[] letterHistogram(String text)
    {
        int[] counts = new int[26];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
                c = (char)(c + ('a' - 'A'));
            }
            if (c >= 'a' && c <= 'z')
            {
                counts[c - 'a']++;
            }
        }

        return counts;
    }

    public static void printHistogram(int[] counts)
    {
        for (int i = 0; i < counts.length; i++)
        {
            if (counts[i] > 0)
            {
                char letter = (char)('a' + i);
                System.out.printf("%c: %d%n", letter, counts[i]);
            }
        }
    }
}
