import java.util.Scanner;

public class FibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("n: ");
        int n = in.nextInt();

        if (n <= 0 || n > 92)
            System.out.println("n must be between 1 and 92");
        else
        {
            long result = fibonacci(n);
            System.out.printf("Fibonacci number %d is %d%n", n, result);
        }
    }

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
