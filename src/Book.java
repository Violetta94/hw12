
public class Book {

    private String namePublishing;
    private Author author;
    private int yearPublishing;

    private int id;

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
    private Book (int id) {
        this.id = id;
    }
    public boolean equals(Object other) {
        Book getYearPublishing = (Book) other;
        if (this.id != getYearPublishing.id) {
            return false;
        }
        return this.id == getYearPublishing.id;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    public String toString() {
        return "Наименование книги: " + this.namePublishing + "; " + author + "; " +
                "" +
                "" + " год издания:" + this.yearPublishing;
    }
}
