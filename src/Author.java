import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String familiAuthor;

    private int id;

    public Author(String nameAuthor, String familiAuthor) {
        this.nameAuthor = nameAuthor;
        this.familiAuthor = familiAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getFamiliAuthor() {
        return familiAuthor;
    }

    public String toString() {
        return "автор:" + this.nameAuthor + " " + this.familiAuthor;
    }

    private Author (int id) {
        this.id = id;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && familiAuthor.equals(author.familiAuthor);
    }

    @Override
        public int hashCode() {
            return java.util.Objects.hash(id);
        }
}
