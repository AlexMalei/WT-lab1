package by.bsuir.task12;

import java.util.Comparator;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public Book() {
    }

    public int getIsbn() {

        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public int hashCode() {
        int result = 31 * price;

        result += ((title == null) ? 0 : title.hashCode());
        result += ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book)obj;

        if (title == null){
            if (book.title != null){
                return false;
            }
        } else if (!title.equals(book.title)){
            return false;
        }

        if (author == null){
            if (book.author != null){
                    return false;
            }
        } else if (!author.equals(book.author)){
            return false;
        }

        return true;

    }

    @Override
    public String toString() { //стоит ли писать this  в методах класса??
        return getClass().getName() + "@title:" + title + " author:"+ author + " edition:" + edition + " price:" + price + " isbn:" + isbn;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book book) {
        return isbn - book.isbn;
    }

}
