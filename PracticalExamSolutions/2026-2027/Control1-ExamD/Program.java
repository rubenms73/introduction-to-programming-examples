import java.util.Scanner;

public class Program
{
    // Adds the divisors of number that are smaller than number
    public static int sumOfProperDivisors(int number)
    {
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++)
            if (number % divisor == 0)
                sum += divisor;
        return sum;
    }

    // Tries n + 1, n + 2, ... until the sum of the proper divisors
    // is greater than the number, that is, until it is abundant
    public static int nextAbundant(int n)
    {
        int candidate = n + 1;
        while (sumOfProperDivisors(candidate) <= candidate)
            candidate++;
        return candidate;
    }

    // Reads n, calls the method and displays the result
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(nextAbundant(n));
        keyboard.close();
    }
}
