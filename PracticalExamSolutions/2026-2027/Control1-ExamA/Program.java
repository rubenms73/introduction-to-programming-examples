import java.util.Scanner;

public class Program
{
    /**
     * Checks whether a number is prime: it must be greater than 1 and
     * no number between 2 and n / 2 can divide it.
     *
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        // One divisor is enough to know that n is not prime
        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;
        return true;
    }

    /**
     * Builds the number with the digits of n in reverse order.
     *
     * @param n a non-negative number
     * @return the number with the digits of n reversed (123 gives 321)
     */
    public static int reverse(int n)
    {
        int reversed = 0;
        while (n > 0)
        {
            // n % 10 is the last digit: append it to reversed
            reversed = reversed * 10 + n % 10;
            // n / 10 removes the last digit
            n = n / 10;
        }
        return reversed;
    }

    /**
     * Finds the smallest number greater than n that is both a palindrome
     * (equal to its reverse) and prime. It tries n + 1, n + 2, ...
     *
     * @param n the starting number
     * @return the first prime palindrome greater than n
     */
    public static int nextPrimePalindrome(int n)
    {
        int candidate = n + 1;
        // Keep going while the candidate fails one of the two conditions
        while (reverse(candidate) != candidate || !isPrime(candidate))
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
        System.out.println(nextPrimePalindrome(n));
        keyboard.close();
    }
}
