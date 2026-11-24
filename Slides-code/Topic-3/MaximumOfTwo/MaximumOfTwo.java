import java.util.Scanner;

/**
 * Displays the maximum of two integers.
 */
public class MaximumOfTwo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Two integers: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        int maximum;
        if (a >= b)
            maximum = a;
        else
            maximum = b;
        System.out.printf("Maximum: %d\n", maximum);
        keyboard.close();
    }
}
