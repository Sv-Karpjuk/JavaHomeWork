package com.pb.karpjuk.hw5;

public class Library {

    public static void main(String[] args) {
        Book[] book = new Book[7];

        book[0] = new Book("Глобус України", "Весельчак У.",1977);
        book[1] = new Book("Життя на Марсі", "Петерсон & Іванісов",2021);
        book[2] = new Book("Китайська філософія", "Пи Як", 1699);
        book[3] = new Book("Війна та мир", "Толстой В.", 1856);
        book[4] = new Book("Журнал Наука и жизнь, вип. 7", "вид.Космос", 1988);
        book[5] = new Book("Журнал Крестьянка вип. 7", "вид.Космос", 1974);
        book[6] = new Book("Психологія", "Мартинов В.А.", 1999);

        Reader[] reader = new Reader[4];

        reader[0] = new Reader("Іванов І.І.", 1,
                "Економіка", "2000-01-01", "(067) 342-07-74");
        reader[1] = new Reader("Петрова П.П.", 23,
                "Математика", "2001-12-07", "(050) 420-38-30");
        reader[2] = new Reader("Сидоров С.С.", 345,
                "Фізика", "2001-02-04", "(099) 909-12-13");
        reader[3] = new Reader("Олегова О.О.", 4567,
                "Астрономія", "2002-03-08", "(068) 234-47-73");

        System.out.println("ПЕРЕЛІК КНИГ:");

        for (int i = 0; i < book.length; i++) {
            System.out.println((i + 1) + ". " + book[i].getInfo());
        }

        System.out.println("Всього книг:" + Book.getBookCount());

        System.out.println("");
        System.out.println("ЧИТАЧІ:");

        for (int i = 0; i < reader.length; i++) {
            System.out.println((i + 1) + ". " + reader[i].getInfo());
        }

        System.out.println("Всього читачів:" + Reader.getReaderCount());

        System.out.println("");
        System.out.println("ВЗЯЛИ:");

        reader[0].takeBook(2);
        reader[1].takeBook("Енциклопедія","Література","Війна і мир");
        reader[2].takeBook(book[3],book[1],book[4],book[6]);

        System.out.println("");
        System.out.println("ПОВЕРНУЛИ:");

        reader[2].returnBook(1);
        reader[3].returnBook("Астрономія","Фізика","Математика");
        reader[1].returnBook(book[0],book[2],book[6]);

        System.out.println("");
        System.out.println("Залишок книг:" + Book.getBookCount());

    }
}

/*
Класс Library используется как демонстрация работы классов Book и Reader.
Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
Выполняются такие действия:
- печатаются все книги.
- печатаются все читатели.
- демонстрируется работа всех вариантов методов takeBook() и returnBook().
*/