import java.util.Scanner;

public class BreakingDownSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Seconds: ");
        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.printf("%d hours, %d minutes, %d seconds%n",
                hours, minutes, seconds);
    }
}
