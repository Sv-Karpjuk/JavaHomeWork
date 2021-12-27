package com.pb.karpjuk.hw13_1;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Random;

public class Consumers implements Runnable{

    public synchronized void get() {

        Random random = new Random();
        int rnd = 0;

        while (buffer.size() == 0) {
            System.out.println("Буфер порожній! Чекаю поки виробник надасть ресурси!");

            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        rnd = (int) (Math.random() * 6);
        System.out.println("Споживач запитує: " + rnd);

        try {
        for (int i = 0; i < buffer.size(); i++) {
            if (buffer.get(i) == null) {
                buffer.remove(i);
                break;
            }
            if (buffer.get(i) == rnd) {
                    buffer.remove(i);
                    System.out.println("Споживач використовує: " + rnd + ". Буфер: " + buffer + ", Size=" + buffer.size());
                    notify();
                }
            }
        } catch (ConcurrentModificationException e) {
        } catch (NullPointerException e) {
        }

    }

    List<Integer> buffer;
    Thread producers;

    public void setProducers(Thread producers) {

        this.producers = producers;
    }

    public Consumers(List<Integer> buffer) {

        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true) {
            get();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

