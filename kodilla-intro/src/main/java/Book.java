public class Book {
    private String author;
    private String title;

    public Book(String author, String title)
    {
        this.author = author;
        this.title = title;
    }

    public static Book offset(String author, String title)
    {
        Book book = new Book(author, title);
        return book;
    }

    public static void main(String[] args)
    {
        Book book = Book.offset("Isaac Asimov", "The Galaxy");
        System.out.println(book.getName());
        System.out.println(book.getTitle());

    }

    public String getName()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

}
