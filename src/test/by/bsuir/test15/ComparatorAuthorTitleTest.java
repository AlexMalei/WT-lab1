package test.by.bsuir.test15;


import by.bsuir.task12.Book;
import by.bsuir.task15.ComparatorAuthorTitle;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComparatorAuthorTitleTest {
    private static Book book;
    private static ComparatorAuthorTitle comparatorAuthorTitle;

    @BeforeClass
    public static void setUpBook(){
        book = new Book("Title", "Author", 342, 353);
        Book.setEdition(2354);
        comparatorAuthorTitle = new ComparatorAuthorTitle();
    }

    @Test
    public void comparatorEqualsTest(){
        Book book = new Book("Title", "Author", 342, 353);
        assertTrue(comparatorAuthorTitle.compare(book, ComparatorAuthorTitleTest.book) == 0);
    }

    @Test
    public void comparatorTestDifferentTitles(){
        Book book = new Book("Title", "Author1", 342, 353);
        assertTrue(comparatorAuthorTitle.compare(book, ComparatorAuthorTitleTest.book) > 0);
    }

    @Test
    public void comparatorTestDifferentAuthors(){
        Book book = new Book("Title", "Autho", 342, 353);
        assertTrue(comparatorAuthorTitle.compare(book, ComparatorAuthorTitleTest.book) < 0);
    }


}