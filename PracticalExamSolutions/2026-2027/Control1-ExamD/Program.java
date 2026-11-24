import java.util.Scanner;

/** Solution to the first lab control, exam D: the next abundant number. */
public class Program
{
    /**
     * Adds the proper divisors of a number, that is, the divisors
     * smaller than the number itself.
     *
     * @param number a positive number
     * @return the sum of the proper divisors of number (12 gives 1+2+3+4+6 = 16)
     */
    public static int sumOfProperDivisors(int number)
    {
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++)
            if (number % divisor == 0)
                sum += divisor;
        return sum;
    }

    /**
     * Finds the smallest abundant number greater than n. A number is
     * abundant when the sum of its proper divisors is greater than it.
     * It tries n + 1, n + 2, ...
     *
     * @param n the starting number
     * @return the first abundant number greater than n
     */
    public static int nextAbundant(int n)
    {
        int candidate = n + 1;
        // Keep going while the candidate is not abundant
        while (sumOfProperDivisors(candidate) <= candidate)
            candidate++;
        return candidate;
    }

    /**
     * Reads n, calls the method and displays the result.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(nextAbundant(n));
        keyboard.close();
    }
}
