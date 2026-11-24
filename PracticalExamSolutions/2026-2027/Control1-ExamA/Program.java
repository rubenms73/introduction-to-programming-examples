import java.util.Scanner;

public class Program
{
    // A number is prime if it is greater than 1 and no number
    // between 2 and n / 2 divides it
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;
        return true;
    }

    // Builds the number with the digits in reverse order:
    // n % 10 takes the last digit and n / 10 removes it
    public static int reverse(int n)
    {
        int reversed = 0;
        while (n > 0)
        {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }

    // Tries n + 1, n + 2, ... until it finds a number that is both
    // a palindrome (equal to its reverse) and prime
    public static int nextPrimePalindrome(int n)
    {
        int candidate = n + 1;
        while (reverse(candidate) != candidate || !isPrime(candidate))
            candidate++;
        return candidate;
    }

    // Reads n, calls the method and displays the result
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(nextPrimePalindrome(n));
        keyboard.close();
    }
}
