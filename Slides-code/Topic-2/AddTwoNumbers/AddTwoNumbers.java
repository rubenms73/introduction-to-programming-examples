import java.util.Scanner;

/**
 * Reads two integers from 0 to 1000 and displays their sum.
 */
public class AddTwoNumbers
{
    /**
     * Reads the two numbers and displays their sum.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Two integers (0..1000): ");
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int sum = number1 + number2;
        System.out.printf("Their sum is %d\n", sum);
        keyboard.close();
    }
}
