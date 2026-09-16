import java.util.Scanner;

public class NumericPalindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Number: ");
        int number = in.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else if (isPalindrome(number))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }

    public static boolean isPalindrome(int number)
    {
        int original = number;
        long reversed = 0;

        while (number > 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }
}
