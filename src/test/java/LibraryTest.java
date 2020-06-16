import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Stab", "Bob McMurder", "Crime");
        book2 = new Book("The Pink Thing", "Barbara Cartland", "Romance");
        book3 = new Book("The Question", "Steve Ditko", "Mystery");
    }

    @Test
    public void canCountNoBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canCountBooks(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canAddBooksUnderCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canAddBooksButNotWhenOverCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        // third book should not be added so result should still be 2 since capacity is 2
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }

}
