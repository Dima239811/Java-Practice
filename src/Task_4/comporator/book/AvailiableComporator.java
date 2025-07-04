package comporator.book;

import model.Book;

import java.util.Comparator;

public class AvailiableComporator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getStatus().compareTo(o2.getStatus());
    }
}
