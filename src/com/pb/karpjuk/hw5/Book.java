package com.pb.karpjuk.hw5;

/**
 * Класс описывающий книги
 */

public class Book {

    static int bookCount = 0;

    public static int getBookCount() {
        return bookCount;
    }

    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public Book(String bookName, String bookAuthor, int bookYear){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        bookCount++;
    }

    String getBookAuthor() {
        return bookAuthor;
    }

    String getBookName() {
        return bookName;
    }

    int getBookYear() {
        return bookYear;
    }

    String getInfo() {
        return "[книга: " + bookName + ", автор: " + bookAuthor + ", " + bookYear + "р.]";
    }
}

/*    Класс Book хранит такую информацию о книге:
        - название
        - автор книги
        - год издания
*/
