import java.util.Scanner;

/**
 * Decides whether a positive number is automorphic, that is, whether
 * its square ends with the number itself.
 */
public class AutomorphicNumber
{
    /**
     * Reads the number and says whether it is automorphic.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        int number = keyboard.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else if (isAutomorphic(number))
            System.out.println("It is automorphic");
        else
            System.out.println("It is not automorphic");
        keyboard.close();
    }

    /**
     * Decides whether the square of a number ends with the number. The
     * modulus is 10 raised to the number of digits, so the remainder of the
     * division gives the last digits of the square.
     *
     * @param number a positive number
     * @return true if number is automorphic, false otherwise
     */
    public static boolean isAutomorphic(int number)
    {
        long square = (long)number * number;
        long modulus = 1;
        int copy = number;

        while (copy > 0)
        {
            modulus *= 10;
            copy = copy / 10;
        }

        return square % modulus == number;
    }
}
