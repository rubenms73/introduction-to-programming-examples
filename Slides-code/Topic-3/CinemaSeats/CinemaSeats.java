/**
 * Prints the seat labels of a small cinema.
 */
public class CinemaSeats
{
    public static void main(String[] args)
    {
        int rows = 3;
        int seatsPerRow = 4;
        for (int row = 1; row <= rows; row++)
        {
            for (int seat = 1; seat <= seatsPerRow; seat++)
            {
                System.out.printf("R%d-S%d ", row, seat);
            }
            System.out.println();
        }
    }
}
