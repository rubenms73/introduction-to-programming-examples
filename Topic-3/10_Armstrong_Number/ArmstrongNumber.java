import java.util.Scanner;

/**
 * Decides whether a three-digit number is an Armstrong number, that is,
 * equal to the sum of the cubes of its digits.
 */
public class ArmstrongNumber
{
    /**
     * Reads the number and says whether it is an Armstrong number.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Three-digit number: ");
        int number = keyboard.nextInt();

        if (number < 100 || number > 999)
            System.out.println("The number must have three digits");
        else if (isArmstrong(number))
            System.out.println("It is an Armstrong number");
        else
            System.out.println("It is not an Armstrong number");
        keyboard.close();
    }

    /**
     * Decides whether a three-digit number is equal to the sum of the cubes
     * of its digits.
     *
     * @param number a number from 100 to 999
     * @return true if number is an Armstrong number, false otherwise
     */
    public static boolean isArmstrong(int number)
    {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = cube(hundreds) + cube(tens) + cube(units);
        return sum == number;
    }

    /**
     * Calculates the cube of a value.
     *
     * @param value the value
     * @return value * value * value
     */
    public static int cube(int value)
    {
        return value * value * value;
    }
}
