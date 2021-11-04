package com.pb.karpjuk.hw6;

import java.util.Objects;

public class Horse extends Animal {

    private String horseName;
    private String horseBreed;
    public Horse(String type, String food, String location, String horseName, String horseBreed) {
        //super("Horse", "Сено", "Загін");
        super(type, food, location);
        this.horseName = horseName;
        this.horseBreed = horseBreed;
    }

    public String getBreed() {
        return horseBreed;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " ірже");
        //super.makeNoise();
    }

    @Override
    public void eat() {
        System.out.println(getType() + " їсть сіно");
        //super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return horseBreed == horse.horseBreed && Objects.equals(horseBreed, horse.horseBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseName,horseBreed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName + '\'' +
                "horseBreed='" + horseBreed + '\'' +
                '}';
    }

}
