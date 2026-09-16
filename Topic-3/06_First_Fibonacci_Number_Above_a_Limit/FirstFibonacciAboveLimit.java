import java.util.Scanner;

public class FirstFibonacciAboveLimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Limit: ");
        long limit = in.nextLong();

        if (limit < 1 || limit > 1000000000L) {
            System.out.println("Limit must be between 1 and 1000000000");
            return;
        }

        long previous = 1;
        long current = 1;
        int position = 1;

        if (current <= limit) {
            position = 2;
        }

        while (current <= limit) {
            long next = previous + current;
            previous = current;
            current = next;
            position++;
        }

        System.out.printf("First Fibonacci number above %d: %d%n",
                limit, current);
        System.out.printf("Position: %d%n", position);
    }
}
