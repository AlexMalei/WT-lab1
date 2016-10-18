package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.Comparator;

public class ComparatorAuthorTitle implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        int compareAuthorValue = book1.getAuthor().compareTo(book2.getAuthor());
        if (compareAuthorValue != 0){
            return compareAuthorValue;
        }
        else {
            return book1.getTitle().compareTo(book2.getTitle());
        }
    }
}
