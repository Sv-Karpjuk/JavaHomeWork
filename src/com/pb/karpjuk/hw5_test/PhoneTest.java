package com.pb.karpjuk.hw5_test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("23", "qre", 2.5f);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.setModel("iphone");
        phone1.setNumber("0991234567");
        phone2.setModel("pixel");


        System.out.println(phone1.getInfo());
        System.out.println(phone2.getInfo());
        System.out.println(phone3.getInfo());

        if (phone1.getNumber() != null) {
            String upperNumber = phone1.getNumber().toUpperCase();
            System.out.println(upperNumber);
        }

        phone1.receiveCall("Иванов");
        phone1.sendMessage("09123456", "234566", "112466");


        // Person person = new Person("Петров А. И.");
        // phone1.takePhoto(person);

        phone1.charging();
        phone1.takePhoto(new Person("Петров А. И."));

        System.out.println("Кол-во телефонов " + Phone.getPhoneCount());
    }
}

/*
    Класс Phone.

        Поля (характеристики)
        - номер (number)
        - модель (model)
        - вес (weight)
        - индикатор заряда (batteryIndicator)

        Методы (действия):
        - принимать звонки (receiveCall)
        - отправлять сообщения (sendMessage)
        - заряжаться (charging)
        - фотографировать (takePhoto)


        Задание:
        a) Создайте класс Phone.
        б) Создайте три экземпляра этого класса.
        в) Выведите на консоль значения их переменных.
        г) Добавить в класс Phone метод: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
        д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        ж) Добавить конструктор без параметров.
        з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
        и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
        к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
        л) Создать метод который делает фотографию человека. Определеить класс человек с характеристикой имя.
 */
