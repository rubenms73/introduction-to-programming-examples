import java.util.Scanner;

public class InvoiceWithDiscountAndVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Base price: ");
        double basePrice = in.nextDouble();
        System.out.print("Discount percentage: ");
        double discountPercentage = in.nextDouble();
        System.out.print("VAT percentage: ");
        double vatPercentage = in.nextDouble();

        double discount = basePrice * discountPercentage / 100.0;
        double discountedPrice = basePrice - discount;
        double vat = discountedPrice * vatPercentage / 100.0;
        double finalPrice = discountedPrice + vat;

        System.out.printf("Final price: %.2f%n", finalPrice);
    }
}
