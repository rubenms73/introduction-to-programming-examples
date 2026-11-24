/**
 * Counts the command-line words that start with a vowel.
 * The words use the letters A-Z or a-z.
 */
public class StartsWith
{
    /**
     * Decides whether a letter is a vowel, uppercase or lowercase.
     *
     * @param c the letter to check
     * @return true if c is a vowel, false otherwise
     */
    public static boolean isVowel(char c)
    {
        if (c >= 'A' && c <= 'Z')
            c = (char) (c + ('a' - 'A'));
        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u';
    }

    /**
     * Displays how many command-line words start with a vowel.
     *
     * @param args the words to check
     */
    public static void main(String[] args)
    {
        int vowels = 0;
        for (int i = 0; i < args.length; i++)
        {
            String word = args[i];
            if (word.length() > 0 && isVowel(word.charAt(0)))
                vowels++;
        }
        System.out.printf("Starts with a vowel: %d\n", vowels);
    }
}
