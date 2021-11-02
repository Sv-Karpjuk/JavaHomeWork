package com.pb.karpjuk.hw5;

public class Reader {

    private static int readerCount = 0;

    public static int getReaderCount() {
        return readerCount;
    }

    private String readerFIO;
    private int readerNumTicket;
    private String readerFaculty;
    private String readerDB;
    private String readerPhone;

    public Reader(String readerFIO, int readerNumTicket, String readerFaculty, String readerDB, String readerPhone){
        this.readerFIO = readerFIO;
        this.readerNumTicket = readerNumTicket;
        this.readerFaculty = readerFaculty;
        this.readerDB = readerDB;
        this.readerPhone = readerPhone;
        readerCount++;
    }

    // takeBook, который будет принимать количество взятых книг
    public void takeBook(int cntBook) {
            System.out.println(readerFIO + " взяв " + cntBook + " книги");
            Book.bookCount = Book.bookCount - cntBook;
    }

    // takeBook, который будет принимать переменное количество названий книг
    public void takeBook(String... nameBooks) {
        System.out.print(readerFIO + " взяв книги:");
        for (String nameBook : nameBooks) {
            System.out.print(" " + nameBook + ",");
            Book.bookCount--;
        }
        System.out.println("\b");
    }

    // takeBook, который будет принимать переменное количество объектов класса Book.
    public void takeBook(Book... nameBooks) {
        System.out.print(readerFIO + " взяв книги:");
        for (Book nameBook : nameBooks) {
            System.out.print(" " + nameBook.getBookName() + " (" + nameBook.getBookAuthor() + ", " + nameBook.getBookYear() + "р.),");
            Book.bookCount--;
        }
        System.out.println("\b");
    }

    // returnBook, который будет принимать количество возвращенных книг
    public void returnBook(int cntBook) {
        System.out.println(readerFIO + " повернув " + cntBook + " книг");
        Book.bookCount = Book.bookCount + cntBook;
    }

    // returnBook, который будет принимать переменное количество возвращенных названий книг
    public void returnBook(String... nameBooks) {
        System.out.print(readerFIO + " повернув книги:");
        for (String nameBook : nameBooks) {
            System.out.print(" " + nameBook + ",");
            Book.bookCount++;
        }
        System.out.println("\b");
    }

    // returnBook, который будет принимать переменное количество объектов класса Book.
    public void returnBook(Book... nameBooks) {
        System.out.print(readerFIO + " повернув книги:");
        for (Book nameBook : nameBooks) {
            System.out.print(" " + nameBook.getBookName() + " (" + nameBook.getBookAuthor() + ", " + nameBook.getBookYear() + "р.),");
            Book.bookCount++;
        }
        System.out.println("\b");
    }

    String getInfo() {
        return "[ПІП: " + readerFIO + ", квиток №: " + readerNumTicket + ", факультет: " + readerFaculty + ", д.н.: " + readerDB+ ", тел.: " + readerPhone + "]";
    }
}

/*
Класс Reader хранит такую информацию о пользователе библиотеки:
- ФИО
- номер читательского билета
- факультет
- дата рождения
- телефон
Типы полей выбирать на свое усмотрение.

Имеет перегруженные методы takeBook(), returnBook():

- takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение
"Петров В. В. взял 3 книги".

- takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

- takeBook, который будет принимать переменное количество объектов класса Book.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".

Аналогичным образом перегрузить метод returnBook().
Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
- "Петров В. В. вернул 3 книги"
- "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
- "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
 */