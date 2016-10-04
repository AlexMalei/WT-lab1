package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class ComparatorTitle implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        switch (book1.getTitle().compareTo(book2.getTitle())) {
            case 1:
                return 1;
            case -1:
                return -1;
        }
        return 0;
    }
}
