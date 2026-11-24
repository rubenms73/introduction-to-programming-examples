/**
 * Calculates the number of combinations of 49 elements taken 6 at a time.
 */
public class Combinatorial
{
    public static double factorial(int n)
    {
        double result = 1.0;
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static double combinatorial(int n, int k)
    {
        return factorial(n) /
                (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args)
    {
        double combinations = combinatorial(49, 6);
        System.out.printf("%.0f\n", combinations);
    }
}
