import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Decimal number: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("The number cannot be negative");
        } else if (number == 0) {
            System.out.println("Binary digits in reverse order: 0");
        } else {
            System.out.print("Binary digits in reverse order: ");
            while (number > 0) {
                System.out.print(number % 2);
                number = number / 2;
            }
            System.out.println();
        }
    }
}
