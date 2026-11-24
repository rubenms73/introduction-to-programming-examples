import java.util.Scanner;

/**
 * Counts the digits of an integer.
 */
public class CountDigits
{
    /**
     * Reads an integer and displays how many digits it has. A do-while loop
     * is used so that 0 counts as one digit.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Integer: ");
        int originalNumber = keyboard.nextInt();

        long number = Math.abs((long) originalNumber);
        int digits = 0;
        do
        {
            digits++;
            number = number / 10;
        } while (number > 0);
        System.out.printf("Digits: %d\n", digits);
        keyboard.close();
    }
}
