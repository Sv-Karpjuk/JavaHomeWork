package com.pb.karpjuk.hw6;

public class Veterinarian {

    private Animal animal;

    public Veterinarian(Animal animal) {
        this.animal = animal;
    }

    public static void treatAnimal(Animal animal) {
        System.out.println("type: " + animal.getType() + ", food: " + animal.getFood() + ", location: " + animal.getLocation());
    }

}
