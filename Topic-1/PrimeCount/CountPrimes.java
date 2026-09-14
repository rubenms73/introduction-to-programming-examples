import java.util.Locale;
import java.util.Scanner;

public class CountPrimes {
    private static final int MAX_LIMIT = 1_000_000_000;

    // Count primes in [2, limit] by trying divisors up to the square root.
    public static int countPrimes(int limit) {
        int count = 0;
        int number = 2;

        while (number <= limit) {
            int divisor = 2;
            while (divisor * divisor <= number && number % divisor != 0) {
                divisor++;
            }
            if (divisor * divisor > number) {
                count++;
            }
            number++;
        }
        return count;
    }

    public static void main(String[] args) {
        int limit;
        try {
            String text;
            if (args.length == 0) {
                System.out.print("Upper limit (0.." + MAX_LIMIT + "): ");
                Scanner keyboard = new Scanner(System.in);
                text = keyboard.nextLine();
            } else if (args.length == 1) {
                text = args[0];
            } else {
                throw new IllegalArgumentException();
            }
            limit = Integer.parseInt(text.trim());
            if (limit < 0 || limit > MAX_LIMIT) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException | java.util.NoSuchElementException ex) {
            System.err.println("Usage: java CountPrimes [limit]");
            System.err.println("Enter an integer from 0 to " + MAX_LIMIT + ".");
            System.exit(1);
            return;
        }

        long start = System.nanoTime();
        int count = countPrimes(limit);
        double elapsed = (System.nanoTime() - start) / 1_000_000_000.0;

        System.out.printf("Primes up to %d: %d%n", limit, count);
        System.out.printf(Locale.ROOT, "Calculation time: %.6f s%n", elapsed);
    }
}
