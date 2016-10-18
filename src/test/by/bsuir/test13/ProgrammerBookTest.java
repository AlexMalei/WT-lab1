package test.by.bsuir.test13;

import by.bsuir.task12.Book;
import by.bsuir.task13.ProgrammerBook;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProgrammerBookTest {
    private static ProgrammerBook programmerBook;

    @BeforeClass
    public static void setUpBook(){
        programmerBook = new ProgrammerBook();
        Book.setEdition(2014);
        programmerBook.setAuthor("Author");
        programmerBook.setPrice(123);
        programmerBook.setTitle("Title");
        programmerBook.setLanguage("English");
        programmerBook.setLevel(5);
    }

    @Test
    public void equalsTrueTest(){
        ProgrammerBook prBook = new ProgrammerBook();
        prBook.setTitle("Title");
        prBook.setPrice(123);
        prBook.setAuthor("Author");
        prBook.setLanguage("English");
        prBook.setLevel(5);
        assertTrue(ProgrammerBookTest.programmerBook.equals(prBook));

    }

    @Test
    public void equalsFalseTest(){
        ProgrammerBook prBook = new ProgrammerBook();
        prBook.setTitle("Title");
        prBook.setPrice(123);
        prBook.setAuthor("Author1");
        prBook.setLanguage("English1");
        prBook.setLevel(5);
        assertFalse(ProgrammerBookTest.programmerBook.equals(prBook));
    }

    @Test
    public void toStringTest(){
        System.out.println(programmerBook.toString());
        assertEquals("by.bsuir.task13.ProgrammerBook@title:Title author:Author edition:2014 price:123 isbn:0 language:English level:5"
                , programmerBook.toString());
    }

    @Test
    public void hashCodeTest(){
        System.out.println(programmerBook.hashCode());
        assertEquals(2114224563, programmerBook.hashCode());
    }

}
