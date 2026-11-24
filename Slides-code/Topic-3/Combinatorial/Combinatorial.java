/**
 * Calculates the number of combinations of 49 elements taken 6 at a time.
 */
public class Combinatorial
{
    /**
     * Calculates the factorial of a number. It uses double because the
     * factorials of numbers like 49 do not fit in a long.
     *
     * @param n a non-negative number
     * @return n! = 1 * 2 * ... * n
     */
    public static double factorial(int n)
    {
        double result = 1.0;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    /**
     * Calculates the number of combinations of n elements taken k at a time.
     *
     * @param n the number of elements
     * @param k the number of elements taken, between 0 and n
     * @return n! / (k! * (n - k)!)
     */
    public static double combinatorial(int n, int k)
    {
        return factorial(n) /
                (factorial(k) * factorial(n - k));
    }

    /**
     * Displays the number of combinations of 49 elements taken 6 at a time.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        double combinations = combinatorial(49, 6);
        System.out.printf("%.0f\n", combinations);
    }
}
