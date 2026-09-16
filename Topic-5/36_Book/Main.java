public class Main
{
    public static void main(String[] args)
    {
        Book first = new Book("9780134685991", "Effective Java", "Joshua Bloch", 2018);
        Book sameIsbn = new Book("9780134685991", "Effective Java", "Joshua Bloch", 2018);
        Book another = new Book("9780132350884", "Clean Code", "Robert C. Martin", 2008);
        System.out.println(first);
        System.out.println("Same ISBN: " + first.equals(sameIsbn));
        System.out.println("Different ISBN: " + first.equals(another));
    }
}
