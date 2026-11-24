import java.util.Scanner;

/**
 * Displays the maximum of three integers.
 */
public class MaximumOfThree
{
    /**
     * Reads three integers and displays the largest one.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Three integers: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        int maximum;
        if (a >= b)
            if (a >= c)
                maximum = a;
            else
                maximum = c;
        else
            if (b >= c)
                maximum = b;
            else
                maximum = c;
        System.out.printf("Maximum: %d\n", maximum);
        keyboard.close();
    }
}
