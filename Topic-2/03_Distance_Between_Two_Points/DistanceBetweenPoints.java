import java.util.Scanner;

/** Calculates the distance between two points in the plane. */
public class DistanceBetweenPoints
{
    /**
     * Reads the coordinates of both points and displays their distance.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = keyboard.nextDouble();
        System.out.print("y1: ");
        double y1 = keyboard.nextDouble();
        System.out.print("x2: ");
        double x2 = keyboard.nextDouble();
        System.out.print("y2: ");
        double y2 = keyboard.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);

        System.out.printf("Distance: %.4f\n", distance);
        keyboard.close();
    }
}
