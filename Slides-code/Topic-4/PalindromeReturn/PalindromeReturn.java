import java.util.Scanner;

/**
 * Decides whether a string is a palindrome.
 */
public class PalindromeReturn
{
    /**
     * Decides whether a text reads the same from left to right and from
     * right to left.
     *
     * @param text the text to check
     * @return true if text is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text)
    {
        int i = 0;
        int j = text.length() - 1;

        while (i < j)
        {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * Reads a text and says whether it is a palindrome.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Text: ");
        String text = keyboard.next();

        if (isPalindrome(text))
            System.out.printf("%s is a palindrome\n", text);
        else
            System.out.printf("%s is not a palindrome\n", text);
        keyboard.close();
    }
}
