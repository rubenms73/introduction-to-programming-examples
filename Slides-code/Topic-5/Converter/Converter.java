/**
 * Converts amounts between euros and dollars.
 */
public class Converter
{
    private static final double EURO_TO_DOLLAR = 1.08;

    public static double eurosToDollars(double euros)
    {
        return euros * EURO_TO_DOLLAR;
    }

    public static double dollarsToEuros(double dollars)
    {
        return dollars / EURO_TO_DOLLAR;
    }
}
