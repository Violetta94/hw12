public class Book {

    String namePublishing;
    private Author author;
   private int yearPublishing;

    public Book (String namePublishing, Author author, int yearPublishing) {
        this.namePublishing = namePublishing;
        this.author = author;
        this.yearPublishing = yearPublishing;

    }

    public String getNamePublishing () {
        return namePublishing;
    }

    public int getYearPublishing () {
        return  yearPublishing;
    }

    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
