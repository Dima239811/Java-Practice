package comporator.book;

import model.Book;

import java.util.Comparator;

public class YearComporator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
