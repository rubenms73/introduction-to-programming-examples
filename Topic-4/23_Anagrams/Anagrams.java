import java.util.Scanner;

/** Decides whether two words are anagrams. */
public class Anagrams
{
    /**
     * Reads two words and says whether they are anagrams.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First word: ");
        String first = keyboard.nextLine();
        System.out.print("Second word: ");
        String second = keyboard.nextLine();

        if (areAnagrams(first, second))
            System.out.println("They are anagrams");
        else
            System.out.println("They are not anagrams");
        keyboard.close();
    }

    /**
     * Decides whether two words have the same letters, ignoring case. The
     * letters of the first word add 1 to their counter and those of the
     * second subtract 1, so all the counters must end at 0.
     *
     * @param first the first word
     * @param second the second word
     * @return true if they are anagrams, false otherwise or if a word has a
     * character that is not a letter
     */
    public static boolean areAnagrams(String first, String second)
    {
        int[] counts = new int[26];

        for (int i = 0; i < first.length(); i++)
        {
            char c = first.charAt(i);
            if (c >= 'A' && c <= 'Z')
                c = (char)(c + ('a' - 'A'));
            if (c < 'a' || c > 'z')
                return false;
            counts[c - 'a']++;
        }

        for (int i = 0; i < second.length(); i++)
        {
            char c = second.charAt(i);
            if (c >= 'A' && c <= 'Z')
                c = (char)(c + ('a' - 'A'));
            if (c < 'a' || c > 'z')
                return false;
            counts[c - 'a']--;
        }

        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                return false;

        return true;
    }
}
