package com.pb.karpjuk.hw10_test.s04extends;

import com.pb.karpjuk.hw10_test.s02nogenerics.Vehicle;

/**
 * Верхняя граница для типов хранящихся в гараже
 */
public class Garage<T extends Vehicle> {

    private T vehicle;

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }
}
