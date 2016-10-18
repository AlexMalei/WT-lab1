package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class ComparatorTitleAuthor implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int compareTitleValue = book1.getTitle().compareTo(book2.getTitle());
        if (compareTitleValue != 0) {
            return compareTitleValue;
        }
        else {
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
    }
}
