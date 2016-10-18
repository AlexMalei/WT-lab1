package test.by.bsuir.test15;

import by.bsuir.task12.Book;

import by.bsuir.task15.ComparatorTitleAuthor;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ComparatorTitleAuthorTest {
    private static Book book;
    private static ComparatorTitleAuthor comparatorTitleAuthor;

    @BeforeClass
    public static void setUpBook(){
        book = new Book("Title", "Author", 342, 353);
        Book.setEdition(2354);
        comparatorTitleAuthor = new ComparatorTitleAuthor();
    }

    @Test
    public void comparatorEqualsTest(){
        Book book = new Book("Title", "Author", 342, 353);
        assertTrue(comparatorTitleAuthor.compare(book, ComparatorTitleAuthorTest.book) == 0);
    }

    @Test
    public void comparatorTestDifferentTitles(){
        Book book = new Book("Title1", "Author1", 342, 353);
        assertTrue(comparatorTitleAuthor.compare(book, ComparatorTitleAuthorTest.book) > 0);
    }

    @Test
    public void comparatorTestEqualsTitles(){
        Book book = new Book("Title", "Autho", 342, 353);
        assertTrue(comparatorTitleAuthor.compare(book, ComparatorTitleAuthorTest.book) < 0);
    }


}
