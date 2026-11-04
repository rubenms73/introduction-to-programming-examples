import java.util.Scanner;

public class RussianPeasantMultiplication
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First factor: ");
        int a = keyboard.nextInt();
        System.out.print("Second factor: ");
        int b = keyboard.nextInt();

        if (a < 0 || b < 0)
            System.out.println("Only non-negative factors are accepted");
        else
        {
            int result = multiply(a, b);
            System.out.println("Result: " + result);
        }
        keyboard.close();
    }

    public static int multiply(int a, int b)
    {
        int result = 0;

        while (b > 0)
        {
            if (b % 2 != 0)
                result += a;
            a *= 2;
            b /= 2;
        }

        return result;
    }
}
