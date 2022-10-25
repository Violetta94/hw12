public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Фёдор Михайлович", "Достоевский");
        Author author2 = new Author("Михаил Афанасьевич", "Булгаков");
        Book book1 = new Book("Преступление и наказание", author1, 1866);
        Book book2 = new Book ("Мастер и Маргарита", author2,1967 );
        System.out.println(book1.getNamePublishing()+" "+author1.getNameAuthor()+" "+author1.getFamiliAuthor()+" "+book1.getYearPublishing());
        System.out.println(book2.getNamePublishing()+" "+author2.getNameAuthor()+" "+author2.getFamiliAuthor()+" "+book2.getYearPublishing());
        book1.setYearPublishing(1865);
        System.out.println(book1.getNamePublishing()+" "+author1.getNameAuthor()+" "+author1.getFamiliAuthor()+" "+book1.getYearPublishing());


    }
}