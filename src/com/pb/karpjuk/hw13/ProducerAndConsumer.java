package com.pb.karpjuk.hw13;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {

    public static void main(String[] args) {

        List<Integer> buffer = new ArrayList<>();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread threadConsumer = new Thread(producer);
        Thread threadProducer = new Thread(consumer);

        System.out.println("Початок роботи...");

        threadConsumer.start();
        threadProducer.start();

    }
}

/*
Написать программу решающую классическую задачу производитель и потребитель.
Дано два потока — производитель и потребитель.
Два потока разделяют общий буфер данных, размер которого ограничен, например не больше 5 элементов.
Производитель генерирует некоторые данные (можно выбрать любые, числа, символы, строки) и помещает их в буфер.
Потребитель «потребляет» их из буфера - выводит на печать в консоль и очищает буфер.
Если буфер пуст, потребитель должен ждать, пока там появятся данные.
Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные и место освободится.
В качестве буфера можно выбрать, например Queue или List, но реализация не должна быть потокобезопасная (например LinkedList).
 */
