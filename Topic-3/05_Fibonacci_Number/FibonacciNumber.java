import java.util.Scanner;

/** Calculates the n-th number of the Fibonacci sequence. */
public class FibonacciNumber
{
    /**
     * Reads n and displays the n-th Fibonacci number. Above 92 the result
     * does not fit in a long.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("n: ");
        int n = keyboard.nextInt();

        if (n <= 0 || n > 92)
            System.out.println("n must be between 1 and 92");
        else
        {
            long result = fibonacci(n);
            System.out.printf("Fibonacci number %d is %d\n", n, result);
        }
        keyboard.close();
    }

    /**
     * Calculates the n-th Fibonacci number. The first two are 1 and each of
     * the next ones is the sum of the two previous ones.
     *
     * @param n the position, from 1 to 92
     * @return the Fibonacci number at position n
     */
    public static long fibonacci(int n)
    {
        if (n <= 2)
            return 1;

        long previous = 1;
        long current = 1;
        for (int position = 3; position <= n; position++)
        {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
}
