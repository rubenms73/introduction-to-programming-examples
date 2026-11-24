import java.util.Scanner;

/**
 * Calculates the total area of a cone.
 */
public class ConeArea
{
    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle
     * @return the area of the circle
     */
    public static double circleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the total area of a cone: the base plus the lateral area.
     *
     * @param radius the radius of the base
     * @param slantHeight the slant height of the cone
     * @return the total area of the cone
     */
    public static double coneArea(double radius, double slantHeight)
    {
        double base = circleArea(radius);
        double lateral = Math.PI * radius * slantHeight;
        return base + lateral;
    }

    /**
     * Reads the radius and the slant height and displays the area.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Radius and slant height: ");
        double radius = keyboard.nextDouble();
        double slantHeight = keyboard.nextDouble();
        System.out.printf("Area: %.2f\n", coneArea(radius, slantHeight));
        keyboard.close();
    }
}
