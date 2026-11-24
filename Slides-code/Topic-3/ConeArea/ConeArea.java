import java.util.Scanner;

/**
 * Calculates the total area of a cone.
 */
public class ConeArea
{
    public static double circleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static double coneArea(double radius, double slantHeight)
    {
        double base = circleArea(radius);
        double lateral = Math.PI * radius * slantHeight;
        return base + lateral;
    }

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
