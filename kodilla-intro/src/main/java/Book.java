public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title)
    {
        Book book = Book.of(author, title);
        return book;
    }

    public static void main(String[] args)
    {
        of("Anna", "djd");

    }

}
