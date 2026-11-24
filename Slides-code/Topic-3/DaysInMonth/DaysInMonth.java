import java.util.Scanner;

/**
 * Displays the number of days in a month of a common year.
 */
public class DaysInMonth
{
    /**
     * Reads a month and displays its number of days.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Month (1-12): ");
        int month = keyboard.nextInt();

        int daysInMonth;
        switch (month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28; // common year
                break;
            default:
                daysInMonth = 31;
        }
        System.out.printf("Days: %d\n", daysInMonth);
        keyboard.close();
    }
}
