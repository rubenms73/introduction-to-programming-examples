import java.util.Scanner;

/**
 * Counts the uppercase letters of a word, except the first and last ones.
 */
public class CountUppercase
{
    /**
     * Reads a word and displays how many uppercase letters it has between the
     * first and the last letter.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Word: ");
        String word = keyboard.next();

        int uppercase = 0;
        for (int i = word.length() - 2; i > 0; i--)
            if (word.charAt(i) >= 'A' &&
                    word.charAt(i) <= 'Z')
                uppercase++;

        System.out.printf("There are %d uppercase letters\n",
                uppercase);
        keyboard.close();
    }
}
