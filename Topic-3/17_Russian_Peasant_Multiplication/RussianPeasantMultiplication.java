import java.util.Scanner;

/** Multiplies two non-negative numbers with the Russian peasant method. */
public class RussianPeasantMultiplication
{
    /**
     * Reads the two factors and displays their product.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First factor: ");
        int a = keyboard.nextInt();
        System.out.print("Second factor: ");
        int b = keyboard.nextInt();

        if (a < 0 || b < 0)
            System.out.println("Only non-negative factors are accepted");
        else
        {
            int result = multiply(a, b);
            System.out.println("Result: " + result);
        }
        keyboard.close();
    }

    /**
     * Multiplies two numbers by doubling a and halving b: when b is odd,
     * the current value of a is added to the result.
     *
     * @param a the first factor
     * @param b the second factor
     * @return a * b
     */
    public static int multiply(int a, int b)
    {
        int result = 0;

        while (b > 0)
        {
            if (b % 2 != 0)
                result += a;
            a *= 2;
            b /= 2;
        }

        return result;
    }
}
