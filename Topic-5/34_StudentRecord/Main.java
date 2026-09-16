public class Main
{
    public static void main(String[] args)
    {
        // These weights belong to this exercise, not to the course assessment.
        StudentRecord first = new StudentRecord("Alex", 7, 8);
        StudentRecord second = new StudentRecord("Sam", 3, 9);
        System.out.println(first.report());
        System.out.println(second.report());
        second.setTheoryMark(6);
        System.out.println("After updating the theory mark: " + second.report());
    }
}
