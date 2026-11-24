import java.util.Scanner;

/** Decides whether a positive number is a palindrome. */
public class NumericPalindrome
{
    /**
     * Reads the number and says whether it is a palindrome.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Number: ");
        int number = keyboard.nextInt();

        if (number <= 0)
            System.out.println("The number must be positive");
        else if (isPalindrome(number))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
        keyboard.close();
    }

    /**
     * Decides whether a number is equal to its reverse. The reversed number
     * is a long because it may not fit in an int.
     *
     * @param number a positive number
     * @return true if number is a palindrome, false otherwise
     */
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
