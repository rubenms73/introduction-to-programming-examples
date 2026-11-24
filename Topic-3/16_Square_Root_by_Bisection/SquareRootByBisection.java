import java.util.Scanner;

/** Calculates an approximation of a square root with the bisection method. */
public class SquareRootByBisection
{
    /**
     * Reads the number and the tolerance and displays the approximation.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        double number = keyboard.nextDouble();
        System.out.print("Tolerance: ");
        double tolerance = keyboard.nextDouble();

        if (number < 0 || number > 1000000 || tolerance < 0.000000001 || tolerance > 1)
            System.out.println("Invalid input");
        else
        {
            double result = squareRoot(number, tolerance);
            System.out.printf("Approximation: %.8f%n", result);
        }
        keyboard.close();
    }

    /**
     * Approximates the square root of a number. The root is always in
     * [low, high]; each step halves the interval until it is smaller than
     * the tolerance.
     *
     * @param number a number from 0 to 1000000
     * @param tolerance the maximum width of the final interval
     * @return the middle of the final interval
     */
    public static double squareRoot(double number, double tolerance)
    {
        double low = 0.0;
        double high = 1.0;
        if (number > 1.0)
            high = number;

        while (high - low > tolerance)
        {
            double middle = (low + high) / 2.0;
            if (middle * middle > number)
                high = middle;
            else
                low = middle;
        }

        return (low + high) / 2.0;
    }
}
