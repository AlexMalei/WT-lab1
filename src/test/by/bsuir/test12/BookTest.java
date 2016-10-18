package test.by.bsuir.test12;

import by.bsuir.task12.Book;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private static Book book;

    @BeforeClass
    public static void setUpBook(){
        book = new Book();
        Book.setEdition(2014);
        book.setAuthor("Author");
        book.setPrice(123);
        book.setTitle("Title");
        book.setIsbn(3);
    }

    @Test
    public void equalsTrueTest(){
        Book book = new Book();
        book.setTitle("Title");
        book.setPrice(123);
        book.setAuthor("Author");
        book.setIsbn(3);
        assertTrue(BookTest.book.equals(book));
    }

    @Test
    public void equalsFalseTest(){
        Book book = new Book();
        book.setTitle("NewTitle");
        book.setPrice(1234);
        book.setAuthor("NewAuthor");
        book.setIsbn(45);
        assertFalse(BookTest.book.equals(book));
    }

    @Test
    public void toStringTest(){
        assertEquals("by.bsuir.task12.Book@title:Title author:Author edition:2014 price:123 isbn:3", book.toString());
    }

    @Test
    public void hashCodeTest(){
        assertEquals(2053328584, book.hashCode());
    }

    @Test
    public void cloneTest(){
        try {
            Book book = (Book) BookTest.book.clone();
            assertTrue(book.equals(BookTest.book));
            book.setTitle("Title123");
            assertFalse(book.getTitle().equals(BookTest.book.getTitle()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}