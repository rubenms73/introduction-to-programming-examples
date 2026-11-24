/**
 * Demonstrates the static methods of Converter.
 */
public class Main
{
    /**
     * Converts two amounts with the static methods of Converter.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        // Static methods are called with the class name, without creating objects
        double dollars = Converter.eurosToDollars(20);
        double euros = Converter.dollarsToEuros(54);
        System.out.printf("20 euros are %.2f dollars\n", dollars);
        System.out.printf("54 dollars are %.2f euros\n", euros);
    }
}
