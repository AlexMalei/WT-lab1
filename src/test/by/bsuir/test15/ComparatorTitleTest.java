package test.by.bsuir.test15;

import by.bsuir.task12.Book;

import by.bsuir.task15.ComparatorTitle;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComparatorTitleTest {
    private static Book book;
    private static ComparatorTitle comparatorTitle;

    @BeforeClass
    public static void setUpBook(){
        book = new Book("Title", "Author", 342, 353);
        Book.setEdition(2354);
        comparatorTitle = new ComparatorTitle();
    }

    @Test
    public void comparatorEqualsTest(){
        Book book = new Book("Title", "Author", 342, 353);
        assertTrue(comparatorTitle.compare(book, ComparatorTitleTest.book) == 0);
    }

    @Test
    public void comparatorGreaterTest(){
        Book book = new Book("Title1", "Author", 342, 353);
        assertTrue(comparatorTitle.compare(book, ComparatorTitleTest.book) > 0);
    }

    @Test
    public void comparatorLessTest(){
        Book book = new Book("Titl", "Author", 342, 353);
        assertTrue(comparatorTitle.compare(book, ComparatorTitleTest.book) < 0);
    }


}
