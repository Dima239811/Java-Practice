package Task_4.comporator.book;

import Task_4.model.Book;

import java.util.Comparator;

public class PriceComporator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
