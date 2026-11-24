import java.util.Scanner;

/**
 * Converts a temperature from degrees Celsius to degrees Fahrenheit.
 */
public class Celsius
{
    /**
     * Converts a temperature from degrees Celsius to degrees Fahrenheit.
     *
     * @param celsius the temperature in degrees Celsius
     * @return the same temperature in degrees Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32;
    }

    /**
     * Reads a temperature in degrees Celsius and displays it in degrees
     * Fahrenheit.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter degrees Celsius: ");
        double celsius = keyboard.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f C are %.2f F\n", celsius, fahrenheit);
        keyboard.close();
    }
}
