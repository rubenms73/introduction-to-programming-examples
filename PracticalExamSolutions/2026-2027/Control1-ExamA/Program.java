import java.util.Scanner;

public class Program
{
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int divisor = 2; divisor <= n / 2; divisor++)
            if (n % divisor == 0)
                return false;
        return true;
    }

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

    public static int nextPrimePalindrome(int n)
    {
        int candidate = n + 1;
        while (reverse(candidate) != candidate || !isPrime(candidate))
            candidate++;
        return candidate;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(nextPrimePalindrome(n));
        keyboard.close();
    }
}
