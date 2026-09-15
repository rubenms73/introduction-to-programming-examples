import java.util.Scanner;

public class LongestRunInSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter positive integers ending in 0:");
        int value = in.nextInt();

        if (value == 0) {
            System.out.println("Empty sequence");
        } else {
            int previous = value;
            int currentRun = 1;
            int bestRun = 1;

            value = in.nextInt();
            while (value != 0) {
                if (value == previous) {
                    currentRun++;
                } else {
                    currentRun = 1;
                }

                if (currentRun > bestRun) {
                    bestRun = currentRun;
                }

                previous = value;
                value = in.nextInt();
            }

            System.out.println("Longest run: " + bestRun);
        }
    }
}
