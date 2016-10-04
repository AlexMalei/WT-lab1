package test.by.bsuir.test14;

import by.bsuir.task12.Book;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparableTest {
    private static Book book;

    @BeforeClass
    public static void setUpBook(){
        book = new Book("Title", "Author", 342, 353);
        Book.setEdition(2354);
    }

    @Test
    public void comparableBiggerTest(){
        Book book = new Book("Title123", "Author123", 7654, 654);
        assertTrue(book.compareTo(ComparableTest.book) > 0);
    }

    @Test
    public void comparableEqualsTest(){
        Book book = new Book("Title123", "Author123", 7654, 353);
        assertTrue(book.compareTo(ComparableTest.book) == 0);
    }

    @Test
    public void comparableLessTest(){
        Book book = new Book("Title123", "Author123", 7654, 123);
        assertTrue(book.compareTo(ComparableTest.book) < 0);
    }
}
