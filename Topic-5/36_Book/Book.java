/**
 * A book identified by its ISBN.
 * The constructor arguments must satisfy the preconditions of the
 * exercise. Invalid setter values leave the previous valid state
 * unchanged.
 */
public class Book
{
    /** The ISBN, which identifies the book. */
    private String isbn;

    /** The title. */
    private String title;

    /** The author. */
    private String author;

    /** The year of publication, positive. */
    private int year;

    /**
     * Creates a book.
     *
     * @param isbn the ISBN, not null or empty
     * @param title the title, not null or empty
     * @param author the author, not null or empty
     * @param year the year of publication, positive
     */
    public Book(String isbn, String title, String author, int year)
    {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    /**
     * Returns the ISBN.
     *
     * @return the ISBN
     */
    public String getIsbn()
    {
        return isbn;
    }

    /**
     * Changes the ISBN. A null or empty value is ignored.
     *
     * @param isbn the new ISBN
     */
    public void setIsbn(String isbn)
    {
        if (isbn != null && isbn.length() > 0)
            this.isbn = isbn;
    }

    /**
     * Returns the title.
     *
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Changes the title. A null or empty value is ignored.
     *
     * @param title the new title
     */
    public void setTitle(String title)
    {
        if (title != null && title.length() > 0)
            this.title = title;
    }

    /**
     * Returns the author.
     *
     * @return the author
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Changes the author. A null or empty value is ignored.
     *
     * @param author the new author
     */
    public void setAuthor(String author)
    {
        if (author != null && author.length() > 0)
            this.author = author;
    }

    /**
     * Returns the year of publication.
     *
     * @return the year of publication
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Changes the year of publication. A value that is not positive is
     * ignored.
     *
     * @param year the new year
     */
    public void setYear(int year)
    {
        if (year > 0)
            this.year = year;
    }

    /**
     * Two books are equal when they have the same ISBN, even if the other
     * data differ.
     *
     * @param object the object to compare with
     * @return true if object is a book with the same ISBN
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            // The same object: it is equal to itself.
            return true;
        if (!(object instanceof Book))
            // null, or an object of another class.
            return false;
        Book other = (Book) object;
        if (isbn == null)
            // No ISBN: equal only if the other one has no ISBN either.
            return other.isbn == null;
        else
            // Compare the texts, not the references.
            return isbn.equals(other.isbn);
    }

    /**
     * Returns the data of the book.
     *
     * @return the text that represents the book
     */
    @Override
    public String toString()
    {
        return String.format("%s, by %s (%d) [ISBN: %s]", title, author, year, isbn);
    }
}
