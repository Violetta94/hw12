import java.util.Objects;

public class Book {

    private String namePublishing;
    private Author author;
    private int yearPublishing;

    public Book(String namePublishing, Author author, int yearPublishing) {
        this.namePublishing = namePublishing;
        this.author = author;
        this.yearPublishing = yearPublishing;

    }

    public String getNamePublishing() {
        return namePublishing;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(namePublishing, book.namePublishing) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(namePublishing, author, yearPublishing);
    }

    public String toString() {
        return "Наименование книги: " + this.namePublishing + "; " + author + "; " +
                "" +
                "" + " год издания:" + this.yearPublishing;
    }
}
