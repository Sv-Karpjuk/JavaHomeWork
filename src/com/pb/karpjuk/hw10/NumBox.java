package com.pb.karpjuk.hw10;

import java.lang.reflect.Array;

public class NumBox <T extends Number> {

    private final T[] array;
    private int size;

    public NumBox(int size, T... t) {
        Class<?> c = t.getClass().getComponentType();
        array = (T[]) Array.newInstance(c, size);
    }

    public void set(int i, T t) {
        this.array[i] = t;
    }

    //метод T get(int index) возвращающий число по индексу.
    public T get(int index) {
        return array[index];
    }

    //метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(T num) {
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
}

/*
 Реализовать параметризованный класс NumBox, T - параметр типа.
 Параметром должен быть любой класс-наследник Number (задать необходимое условие при объявлении класса NumBox).
 Класс содержит:
 - массив из объектов класса T, инициализировать массив в конструкторе.
 - конструктор принимающий параметр - максимальную длину массива.
 - метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
 - метод T get(int index) возвращающий число по индексу.
 - метод int length() возвращает текущее количество элементов.
 - метод double average() - подсчет среднего арифметического среди элементов массива.
 - метод double sum() - сумма всех элементов массива.
 - метод T max() - максимальный элемент массива.
 При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
*/
