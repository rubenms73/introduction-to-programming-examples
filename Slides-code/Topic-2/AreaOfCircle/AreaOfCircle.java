import java.util.Scanner;

/**
 * Reads a radius from 0 to 1000000 and displays the area of the circle.
 */
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        final double PI = 3.141592653589793;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = keyboard.nextDouble();
        double area = PI * radius * radius;
        System.out.printf("Area: %.6f\n", area);
        keyboard.close();
    }
}
