import java.util.Scanner;

/** Calculates the final price of an invoice with a discount and VAT. */
public class InvoiceWithDiscountAndVat
{
    /**
     * Reads the base price and the percentages and displays the final price.
     * The discount is applied first and the VAT is added to the discounted
     * price.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Base price: ");
        double basePrice = keyboard.nextDouble();
        System.out.print("Discount percentage: ");
        double discountPercentage = keyboard.nextDouble();
        System.out.print("VAT percentage: ");
        double vatPercentage = keyboard.nextDouble();

        double discount = basePrice * discountPercentage / 100.0;
        double discountedPrice = basePrice - discount;
        double vat = discountedPrice * vatPercentage / 100.0;
        double finalPrice = discountedPrice + vat;

        System.out.printf("Final price: %.2f%n", finalPrice);
        keyboard.close();
    }
}
