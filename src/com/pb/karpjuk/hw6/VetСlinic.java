package com.pb.karpjuk.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {

        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Кіт", "Молоко", "Квартира", "Васька", "Сіамський");
        animal[1] = new Dog("Пес","Мясо","Двір","Бровко","Дворняга");
        animal[2] = new Horse("Кінь","Сіно","Загін","Сивий","Пржевальського");

        Veterinarian veterinarian = new Veterinarian(animal[0]);

        System.out.println("");
        animal[0].makeNoise();
        animal[1].makeNoise();
        animal[2].makeNoise();

        System.out.println("");
        animal[0].eat();
        animal[1].eat();
        animal[2].eat();

        System.out.println("");
        animal[0].sleep();
        animal[1].sleep();
        animal[2].sleep();

        System.out.println("");
        System.out.println(animal[2]);

        System.out.println("");
        System.out.println("hashCode: " + animal[2].hashCode());

        System.out.println("");
        System.out.println("Порівняння " + animal[1].getType() + " та " + animal[2].getType() + ": " + animal[1].equals(animal[2]));
        System.out.println("Порівняння " + animal[1].getType() + " та " + animal[1].getType() + ": " + animal[1].equals(animal[1]));

        System.out.println("");
        System.out.println("ВІДПРАВКА ДО ВЕТЕРИНАРА:");

        //for (int i = 0; i < 3; i++) {
        //    System.out.print(animal[i].getType() + ": ");
        //    veterinarian.treatAnimal(animal[i]);
        //}

        //рефлексия
        Class clazz = Class.forName("com.pb.karpjuk.hw6.Veterinarian");

        Constructor treatAnimal = clazz.getConstructor(new Class[]{Animal.class});

        Object obj = treatAnimal.newInstance(animal[1]);
        for (int i = 0; i < animal.length; i++) {
            ((Veterinarian) obj).treatAnimal(animal[i]);
        }


    }
}
