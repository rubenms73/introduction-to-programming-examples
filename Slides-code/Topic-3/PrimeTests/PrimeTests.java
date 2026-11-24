/**
 * Tests the isPrime method and counts the failures.
 */
public class PrimeTests
{
    public static boolean isPrime(int number)
    {
        if (number <= 1)
            return false;
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)
                return false;
        return true;
    }

    // Returns 1 if the check fails and 0 if it passes
    public static int checkPrime(int number, boolean expected)
    {
        boolean actual = isPrime(number);
        if (actual != expected)
        {
            System.out.printf(
                    "FAIL: input=%d expected=%b actual=%b\n",
                    number, expected, actual);
            return 1;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int failures = 0;
        failures += checkPrime(-1, false);
        failures += checkPrime(0, false);
        failures += checkPrime(1, false);
        failures += checkPrime(2, true);
        failures += checkPrime(3, true);
        failures += checkPrime(4, false);
        failures += checkPrime(9, false);
        failures += checkPrime(25, false);
        failures += checkPrime(29, true);
        System.out.printf("Failures: %d\n", failures);
    }
}
