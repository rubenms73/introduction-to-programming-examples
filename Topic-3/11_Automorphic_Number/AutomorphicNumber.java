import java.util.Scanner;

public class AutomorphicNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        int number = in.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else if (isAutomorphic(number))
            System.out.println("It is automorphic");
        else
            System.out.println("It is not automorphic");
    }

    public static boolean isAutomorphic(int number)
    {
        long square = (long)number * number;
        long modulus = 1;
        int copy = number;

        while (copy > 0)
        {
            modulus *= 10;
            copy = copy / 10;
        }

        return square % modulus == number;
    }
}
