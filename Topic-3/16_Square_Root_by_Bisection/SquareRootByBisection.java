import java.util.Scanner;

public class SquareRootByBisection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        double number = in.nextDouble();
        System.out.print("Tolerance: ");
        double tolerance = in.nextDouble();

        if (number < 0 || tolerance <= 0) {
            System.out.println("Invalid input");
        } else {
            double result = squareRoot(number, tolerance);
            System.out.printf("Approximation: %.8f%n", result);
        }
    }

    public static double squareRoot(double number, double tolerance) {
        double low = 0.0;
        double high = Math.max(1.0, number);

        while (high - low > tolerance) {
            double middle = (low + high) / 2.0;
            if (middle * middle > number) {
                high = middle;
            } else {
                low = middle;
            }
        }

        return (low + high) / 2.0;
    }
}
