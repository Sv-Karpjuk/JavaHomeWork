package com.pb.karpjuk.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String catName;
    private String catBreed;

    public Cat(String type, String food, String location, String catName, String catBreed) {
        //super("Cat", "Молоко", "Квартира");
        super(type, food, location);
        this.catName = catName;
        this.catBreed = catBreed;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " мявкає");
        //super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(getType() + " їсть мишу");
        //super.makeNoise();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catBreed == cat.catBreed && Objects.equals(catBreed, cat.catBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName,catBreed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + catName + '\'' +
                "horseBreed='" + catBreed + '\'' +
                '}';
    }

}
