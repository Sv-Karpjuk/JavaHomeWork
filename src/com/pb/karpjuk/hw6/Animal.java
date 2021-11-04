package com.pb.karpjuk.hw6;

public class Animal {

    private String type;
    private String food;
    private String location;

    public Animal(String type, String food, String location) {
        this.type = type;
        this.food = food;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }

    public void makeNoise() {
        System.out.println(type + " шумить");
    }

    public void eat() {
        System.out.println(type + " їсть");
    }

    public void sleep() {
        System.out.println(type + " спить");
    }
}

/*
    В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
    Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    Метод sleep, например, может выводить на консоль "Такое-то животное спит".
    Dog, Cat, Horse переопределяют методы makeNoise, eat.
    Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
    В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
    Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
    Пусть этот метод печатает на экран food и location пришедшего на прием животного.
    Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
    В цикле отправляйте животных на прием к ветеринару.
    Объект класса Veterinarian создайте с помощью рефлексии.
*/

