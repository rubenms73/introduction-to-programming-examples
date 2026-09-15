public class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;

    public Book(String isbn, String title, String author, int year) {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn != null && !isbn.isBlank()) {
            this.isbn = isbn;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isBlank()) {
            this.author = author;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return isbn != null && isbn.equals(other.isbn);
    }

    @Override
    public String toString() {
        return String.format("%s, by %s (%d) [ISBN: %s]",
                title, author, year, isbn);
    }
}
