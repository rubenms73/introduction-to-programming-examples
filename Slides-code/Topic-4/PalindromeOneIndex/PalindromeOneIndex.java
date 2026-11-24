import java.util.Scanner;

/**
 * Decides whether a string is a palindrome.
 */
public class PalindromeOneIndex
{
    /**
     * Reads a text and says whether it is a palindrome. A single index i is
     * used: the character at i is compared with the one at length - 1 - i.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Text: ");
        String text = keyboard.next();

        int i = 0;

        while (i < text.length() / 2 &&
                text.charAt(i) ==
                text.charAt(text.length() - 1 - i))
            i++;

        if (i < text.length() / 2)
            System.out.printf("%s is not a palindrome\n", text);
        else
            System.out.printf("%s is a palindrome\n", text);
        keyboard.close();
    }
}
