import java.util.Scanner;

public class FirstFibonacciAboveLimit
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Limit: ");
        long limit = keyboard.nextLong();

        if (limit < 1 || limit > 1000000000L)
            System.out.println("Limit must be between 1 and 1000000000");
        else
        {
            // The first two numbers are 1, which is never above the limit.
            long previous = 1;
            long current = 1;
            int position = 2;

            while (current <= limit)
            {
                long next = previous + current;
                previous = current;
                current = next;
                position++;
            }

            System.out.printf("First Fibonacci number above %d: %d%n", limit, current);
            System.out.printf("Position: %d%n", position);
        }
        keyboard.close();
    }
}
