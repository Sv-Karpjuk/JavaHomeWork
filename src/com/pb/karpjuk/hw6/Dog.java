package com.pb.karpjuk.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String dogName;
    private String dogBreed;

    public Dog(String type, String food, String location, String dogName, String dogBreed) {
        //super("Dog", "Мясо", "Будка");
        super(type, food, location);
        this.dogName = dogName;
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " гавкає");
        //super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(getType() + " їсть кота");
        //super.makeNoise();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dogBreed == dog.dogBreed && Objects.equals(dogBreed, dog.dogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogName,dogBreed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + dogName + '\'' +
                "horseBreed='" + dogBreed + '\'' +
                '}';
    }

}
