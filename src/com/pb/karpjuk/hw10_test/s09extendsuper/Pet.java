package com.pb.karpjuk.hw10_test.s09extendsuper;

public class Pet extends Animal {

    public Pet(String name) {
        super(name);
    }

    public void call() {
        System.out.println("Зовем питомца по кличке: " + name);
    }
}
