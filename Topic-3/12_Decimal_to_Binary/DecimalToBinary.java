import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Decimal number: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("The number cannot be negative");
        } else {
            System.out.println("Binary: " + toBinary(number));
        }
    }

    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }

        String binary = "";
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        return binary;
    }
}
