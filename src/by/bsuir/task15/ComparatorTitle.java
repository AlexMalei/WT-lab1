package by.bsuir.task15;

import by.bsuir.task12.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTitle implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kek");
        list.add("lol");



        return book1.getTitle().compareTo(book2.getTitle());


    }
}
