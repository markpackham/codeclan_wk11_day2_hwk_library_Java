import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        borrower = new Borrower("Bob");
        library = new Library(100);
        book1 = new Book("The Stab", "Bob McMurder", "Crime");
        book2 = new Book("The Pink Thing", "Barbara Cartland", "Romance");
        book3 = new Book("The Question", "Steve Ditko", "Mystery");
    }

    @Test
    public void canTakeBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.takeBook(library);
        assertEquals(1, borrower.countBooks());
    }
}
