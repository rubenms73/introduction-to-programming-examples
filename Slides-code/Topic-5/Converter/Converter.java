/**
 * Converts amounts between euros and dollars.
 */
public class Converter
{
    /** The number of dollars that one euro is worth. */
    private static final double EURO_TO_DOLLAR = 1.08;

    /**
     * Converts an amount of euros into dollars.
     *
     * @param euros the amount in euros
     * @return the same amount in dollars
     */
    public static double eurosToDollars(double euros)
    {
        return euros * EURO_TO_DOLLAR;
    }

    /**
     * Converts an amount of dollars into euros.
     *
     * @param dollars the amount in dollars
     * @return the same amount in euros
     */
    public static double dollarsToEuros(double dollars)
    {
        return dollars / EURO_TO_DOLLAR;
    }
}
