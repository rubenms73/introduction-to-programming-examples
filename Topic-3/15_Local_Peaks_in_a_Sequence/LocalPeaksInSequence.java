import java.util.Scanner;

public class LocalPeaksInSequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter positive integers ending in 0:");
        int previous = in.nextInt();

        if (previous == 0)
            System.out.println("Local peaks: 0");
        else
        {
            int current = in.nextInt();
            int peaks = 0;

            while (current != 0)
            {
                int next = in.nextInt();
                if (next != 0 && current > previous && current > next)
                    peaks++;
                previous = current;
                current = next;
            }

            System.out.println("Local peaks: " + peaks);
        }
    }
}
