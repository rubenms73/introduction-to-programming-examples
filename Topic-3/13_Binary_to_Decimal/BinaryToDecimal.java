import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Binary number: ");
        long binary = keyboard.nextLong();

        int decimal = 0;
        int power = 1;
        boolean valid = binary >= 0;

        while (binary > 0 && valid)
        {
            int digit = (int)(binary % 10);
            if (digit > 1)
                valid = false;
            else
            {
                decimal += digit * power;
                power *= 2;
                binary = binary / 10;
            }
        }

        if (valid)
            System.out.println("Decimal: " + decimal);
        else
            System.out.println("Invalid binary number");
        keyboard.close();
    }
}
