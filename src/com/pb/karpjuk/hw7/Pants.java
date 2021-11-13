package com.pb.karpjuk.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    public Pants(Sizes size, String color, double price) {
        super("Штани", size, color, price);
    }
}

// Pants (штаны) реализует интерфейсы ManClothes и WomenClothes
