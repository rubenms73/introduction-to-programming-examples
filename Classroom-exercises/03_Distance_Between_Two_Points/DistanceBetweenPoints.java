import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = in.nextDouble();
        System.out.print("y1: ");
        double y1 = in.nextDouble();
        System.out.print("x2: ");
        double x2 = in.nextDouble();
        System.out.print("y2: ");
        double y2 = in.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);

        System.out.printf("Distance: %.4f%n", distance);
    }
}
