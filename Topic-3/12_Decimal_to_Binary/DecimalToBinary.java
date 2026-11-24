import java.util.Scanner;

/** Converts a non-negative decimal number to binary. */
public class DecimalToBinary
{
    /**
     * Reads the number and prints its binary digits in reverse order: each
     * remainder of dividing by 2 is the next digit.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Decimal number: ");
        int number = keyboard.nextInt();

        if (number < 0)
            System.out.println("The number cannot be negative");
        else if (number == 0)
            System.out.println("Binary digits in reverse order: 0");
        else
        {
            System.out.print("Binary digits in reverse order: ");
            while (number > 0)
            {
                System.out.print(number % 2);
                number = number / 2;
            }
            System.out.println();
        }
        keyboard.close();
    }
}
