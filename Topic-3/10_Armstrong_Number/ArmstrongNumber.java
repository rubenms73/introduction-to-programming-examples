import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Three-digit number: ");
        int number = in.nextInt();

        if (number < 100 || number > 999)
        {
            System.out.println("The number must have three digits");
        }
        else if (isArmstrong(number))
        {
            System.out.println("It is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int number)
    {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int sum = cube(hundreds) + cube(tens) + cube(units);
        return sum == number;
    }

    public static int cube(int value)
    {
        return value * value * value;
    }
}
