import java.util.Scanner;

/**
 * Decides whether a string is a palindrome.
 */
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Text: ");
        String text = keyboard.next();

        int i = 0;
        int j = text.length() - 1;

        while (i < j && text.charAt(i) == text.charAt(j))
        {
            i++;
            j--;
        }

        if (i < j)
            System.out.printf("%s is not a palindrome\n", text);
        else
            System.out.printf("%s is a palindrome\n", text);
        keyboard.close();
    }
}
