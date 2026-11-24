/**
 * Counts the command-line words that start with a vowel.
 * The words use the letters A-Z or a-z.
 */
public class StartsWith
{
    public static boolean isVowel(char c)
    {
        if (c >= 'A' && c <= 'Z')
            c = (char) (c + ('a' - 'A'));
        return c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u';
    }

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
