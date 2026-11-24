import java.util.Scanner;

public class Program
{
    public static int sumOfProperDivisors(int number)
    {
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++)
        {
            if (number % divisor == 0)
                sum += divisor;
        }
        return sum;
    }

    public static int nextAbundant(int n)
    {
        int candidate = n + 1;
        while (sumOfProperDivisors(candidate) <= candidate)
        {
            candidate++;
        }
        return candidate;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(nextAbundant(n));
        keyboard.close();
    }
}
