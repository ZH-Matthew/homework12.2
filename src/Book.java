
public class Book {
    private final String nameBook;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.nameBook = name;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return nameBook.equals(c2.nameBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }

    @Override
    public String toString() {
        return nameBook + " " + year + " Автор: " + author.getfName() + " " + author.getlName();
    }
}
