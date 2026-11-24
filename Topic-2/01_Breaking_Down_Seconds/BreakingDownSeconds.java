import java.util.Scanner;

/** Breaks down an amount of seconds into hours, minutes and seconds. */
public class BreakingDownSeconds
{
    /**
     * Reads the seconds and displays the hours, minutes and seconds.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Seconds: ");
        int totalSeconds = keyboard.nextInt();

        int hours = totalSeconds / 3600;
        int remaining = totalSeconds % 3600;
        int minutes = remaining / 60;
        int seconds = remaining % 60;

        System.out.printf("%d hours, %d minutes, %d seconds%n", hours, minutes, seconds);
        keyboard.close();
    }
}
