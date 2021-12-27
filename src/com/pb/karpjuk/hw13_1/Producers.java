package com.pb.karpjuk.hw13_1;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Random;

public class Producers implements Runnable{

    public synchronized void put() {

        Random random = new Random();
        int rnd = 0;

        while (buffer.size() >= 5) {
            try {
                System.out.println("Буфер повний! чекаю поки споживач використає ресурси!");
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        rnd = (int) (Math.random() * 6);

        try {
            buffer.add(rnd);
            System.out.println("Виробник добавляє: " + rnd + ". Буфер: " + buffer + ", Size=" + buffer.size());
            notify();
        } catch (ConcurrentModificationException e) {
        }

    }

    List<Integer> buffer;
    Thread consumers;

    public void setConsumers(Thread consumers) {

        this.consumers = consumers;
    }

    public Producers(List<Integer> buffer) {

        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true) {
            put();
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
