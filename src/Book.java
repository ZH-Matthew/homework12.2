
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book v2 = (Book) obj;
        return year == v2.year &&
                Author.equals(this.author, v2.author) &&
                nameBook.equals(v2.nameBook);

    }

    @Override
    public int hashCode() {
        int result1 = nameBook == null ? 0 : nameBook.hashCode();
        int result2 = author.hashCode();
        int resultFinal = result1;
        resultFinal = 31 * resultFinal + result2;
        resultFinal = 31 * resultFinal + year;
        return resultFinal;
    }

    @Override
    public String toString() {
        return nameBook + " " + year + " Автор: " + author.getfName() + " " + author.getlName();
    }
}
