import java.util.Scanner;

/**
 * Displays the bus fare for a destination (1, 2 or 3) and a non-negative age.
 */
public class BusFare
{
    // Returns -1 for an unknown destination
    public static int fare(int destination, int age)
    {
        int price;
        if (destination == 1)
            price = (age < 18 || age > 64) ? 10 : 15;
        else if (destination == 2)
            price = (age < 18 || age > 64) ? 15 : 20;
        else if (destination == 3)
            price = (age < 18 || age > 64) ? 30 : 35;
        else
            price = -1; // Unknown destination
        return price;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Destination (1/2/3): ");
        int destination = keyboard.nextInt();
        System.out.print("Age: ");
        int age = keyboard.nextInt();

        int price = fare(destination, age);
        if (price == -1)
            System.out.println("Unknown destination");
        else
            System.out.printf("Fare: %d\n", price);
        keyboard.close();
    }
}
