package com.pb.karpjuk.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Sizes size, String color, double price) {
        super("Футболка", size, color, price);
    }
}

// Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes
