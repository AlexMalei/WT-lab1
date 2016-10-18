package test.by.bsuir.test15;

import by.bsuir.task12.Book;

import by.bsuir.task15.ComparatorAuthorTitlePrice;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorAuthorTitlePriceTest {
    private static Book book;
    private static ComparatorAuthorTitlePrice comparatorAuthorTitlePrice;

    @BeforeClass
    public static void setUpBook(){
        book = new Book("Title", "Author", 342, 353);
        Book.setEdition(2354);
        comparatorAuthorTitlePrice = new ComparatorAuthorTitlePrice();
    }

    @Test
    public void comparatorEqualsTest(){
        Book book = new Book("Title", "Author", 342, 353);
        assertTrue(comparatorAuthorTitlePrice.compare(book, ComparatorAuthorTitlePriceTest.book) == 0);
    }

    @Test
    public void comparatorTestDifferentAuthors(){
        Book book = new Book("Title1", "Author1", 342, 353);
        assertTrue(comparatorAuthorTitlePrice.compare(book, ComparatorAuthorTitlePriceTest.book) > 0);
    }
    @Test
    public void comparatorTestDifferentTitles(){
        Book book = new Book("Title", "Author1", 342, 353);
        assertTrue(comparatorAuthorTitlePrice.compare(book, ComparatorAuthorTitlePriceTest.book) > 0);
    }

    @Test
    public void comparatorTestDifferentPrices(){
        Book book = new Book("Title", "Author", 343, 353);
        assertTrue(comparatorAuthorTitlePrice.compare(book, ComparatorAuthorTitlePriceTest.book) > 0);
    }

}