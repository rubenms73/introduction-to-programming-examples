import java.util.Scanner;

/**
 * Displays the grade for a mark between 0 and 10.
 */
public class FinalGrade
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Mark (0-10): ");
        double mark = keyboard.nextDouble();

        if (mark < 5)
            System.out.println("Fail");
        else if (mark < 7)
            System.out.println("Pass");
        else if (mark < 9)
            System.out.println("Good");
        else
            System.out.println("Excellent");
        keyboard.close();
    }
}
