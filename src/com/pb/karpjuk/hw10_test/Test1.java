package com.pb.karpjuk.hw10_test;

import java.lang.Integer;
import java.lang.reflect.Array;

//https://qastack.ru/programming/529085/how-to-create-a-generic-array-in-java

public class Test1<T extends Number> {

    private final T[] array;
    private int size;

    public Test1(int size, T... t) {
        Class<?> c = t.getClass().getComponentType();
        array = (T[])Array.newInstance(c, size);
    }

    public void set(int i, T t){
        this.array[i] = t;
    }

    //метод T get(int index) возвращающий число по индексу.
    public T get(int index){
        return array[index];
    }

    //метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(T num){
        array[size] = num;
        size++;
    }

    //метод int length() возвращает текущее количество элементов.
    public int length() {
        int cnt = 0;
        cnt = array.length;
        return cnt;
    }

    //метод double sum() - сумма всех элементов массива.
    public double sum() {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i].doubleValue();
        }
        return summ;
    }

    //метод double average() - подсчет среднего арифметического среди элементов массива.
    public double average() {
        double average = 0;
        if (array.length > 0) {
            average = sum() / array.length;
        }
        return average;
    }

    //метод T max() - максимальный элемент массива.
    public T max() {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].doubleValue() > max.doubleValue()) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return array.getClass().getComponentType().getName()
                + "[" + array.length + "]";
    }

    public static void main(String[] args) {

        //Integer
        Test1<Integer> intSet1 = new Test1<Integer>(3);

        System.out.println(intSet1);

        //intSet1.get(3);

        //вводимо масив цілих
        //intSet1.set(0, 1);
        //intSet1.set(1, 2);
        //intSet1.set(2, 3);

        try {
            intSet1.add(1);
            intSet1.add(999999);
            intSet1.add(3);
            intSet1.add(4); // це лишній елемент для перевірки
        } catch (Exception e1) {
            System.out.println("Увага! Масив " + intSet1 + " заповнений! Додати дані неможливо!");
        }

        //поправка ;)
        intSet1.set(1,2);

        //Вивід1
        System.out.println("element #2 = " + intSet1.get(1));
        System.out.println("Length = " + intSet1.length());
        System.out.println("Average = " + intSet1.average());
        System.out.println("Sum = " + intSet1.sum());
        System.out.println("Max = " + intSet1.max());

        System.out.println("");

        //Float
        Test1<Float> intSet2 = new Test1<Float>(5);

        System.out.println(intSet2);

        //intSet2.get(3);

        //вводимо масив дробових
        //intSet2.set(0, 1.11f);
        //intSet2.set(1, 2.22f);
        //intSet2.set(2, 3.33f);
        //intSet2.set(3, 4.44f);
        //intSet2.set(4, 5.55f);

        try {
            intSet2.add(1.11f);
            intSet2.add(2.22f);
            intSet2.add(3.33f);
            intSet2.add(4.44f);
            intSet2.add(5.55f);
            intSet2.add(6.66f); // це лишній елемент для перевірки
        } catch (Exception e2) {
            System.out.println("Увага! Масив " + intSet2 + " повністю заповнений! Додати дані неможливо!");
        }

        //Вивід2
        System.out.println("element #2 = " + intSet2.get(1));
        System.out.println("Length = " + intSet2.length());
        System.out.println("Average = " + intSet2.average());
        System.out.println("Sum = " + intSet2.sum());
        System.out.println("Max = " + intSet2.max());

    }
}
