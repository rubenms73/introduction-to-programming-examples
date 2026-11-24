import java.util.Scanner;

/**
 * Decides whether a number is prime, in three different ways.
 */
public class Prime
{
    // Version 3: a method that returns as soon as the answer is known
    public static boolean isPrime(int number)
    {
        if (number <= 1)
            return false;
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Integer: ");
        int number = keyboard.nextInt();

        // Version 1: a while loop with an initial hypothesis
        boolean isPrime = number > 1;
        int divisor = 2;
        while (divisor <= number / 2 && isPrime)
        {
            if (number % divisor == 0)
                isPrime = false;
            else
                divisor++;
        }
        System.out.println("while:  " + isPrime);

        // Version 2: the same search with break
        boolean isPrimeBreak = number > 1;
        for (int d = 2; d <= number / 2; d++)
        {
            if (number % d == 0)
            {
                isPrimeBreak = false;
                break;
            }
        }
        System.out.println("break:  " + isPrimeBreak);

        System.out.println("method: " + isPrime(number));
        keyboard.close();
    }
}
