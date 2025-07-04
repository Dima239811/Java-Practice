package model;


import enums.StatusBook;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    private int year;
    private double price;
    private StatusBook status;  // в наличии или отсутствует
    private Date entranceDate;
    private int bookId;

//    public Book(String name, String authtor, int year, double price) {
//        this.name = name;
//        this.author = authtor;
//        this.year = year;
//        this.price = price;
//        this.status = StatusBook.IN_STOCK;
//        this.bookId = 0;
//    }


    public Book(String name, String author, int year, double price, StatusBook status, Date entranceDate) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
        this.status = status;
        this.entranceDate = entranceDate;
        this.bookId = 0;
    }

    public Book(String name, String author, int year, double price, StatusBook status, Date entranceDate, int bookId) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
        this.status = status;
        this.entranceDate = entranceDate;
        this.bookId = bookId;
    }

//    public Book(String name, String authtor, int year, double price, StatusBook status, int bookId) {
//        this.name = name;
//        this.author = authtor;
//        this.year = year;
//        this.price = price;
//        this.status = status;
//        this.bookId = bookId;
//    }


    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(StatusBook statusBook) {
        this.status = statusBook;
    }

    public StatusBook getStatus() {
        return status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", status=" + status +
                ", entranceDate=" + entranceDate +
                ", bookId=" + bookId +
                '}';
    }
}
