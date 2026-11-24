import java.util.Scanner;

/**
 * Laboratory Control 1, model A: the next prime palindrome.
 */
public class Program
{
    // A number is prime if it is greater than 1 and has no other divisors
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int divisor = 2; divisor <= n / divisor; divisor++)
        {
            if (n % divisor == 0)
                return false;
        }
        return true;
    }

    // Reverses the digits of a non-negative number
    public static int reverse(int n)
    {
        int reversed = 0;
        while (n > 0)
        {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static int nextPrimePalindrome(int n)
    {
        int candidate = n + 1;
        while (!(reverse(candidate) == candidate && isPrime(candidate)))
        {
            candidate++;
        }
        return candidate;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("n: ");
        int n = keyboard.nextInt();
        System.out.println(nextPrimePalindrome(n));
        keyboard.close();
    }
}
