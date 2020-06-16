import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int countBooks() {
       return this.books.size();
    }

    private void addBook(Book book) {
        this.books.add(book);
    }

    public void takeBook(Library library) {
        Book bookRemoved = library.removeBook();
        this.addBook(bookRemoved);
    }
}
