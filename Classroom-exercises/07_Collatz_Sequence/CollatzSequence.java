import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        long number = in.nextLong();

        if (number <= 0) {
            System.out.println("The number must be positive");
        } else {
            int steps = 0;
            System.out.print(number);

            while (number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = number * 3 + 1;
                }
                steps++;
                System.out.print(" " + number);
            }

            System.out.printf("%nSteps: %d%n", steps);
        }
    }
}
