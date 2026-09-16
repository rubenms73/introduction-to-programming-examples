import java.util.Scanner;

public class HarshadNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        int number = in.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else
        {
            int sum = sumDigits(number);
            if (number % sum == 0)
                System.out.println("It is a Harshad number");
            else
                System.out.println("It is not a Harshad number");
        }
    }

    public static int sumDigits(int number)
    {
        int sum = 0;
        while (number > 0)
        {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
