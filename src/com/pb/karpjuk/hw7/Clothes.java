package com.pb.karpjuk.hw7;

public abstract class Clothes {
    private String type;
    private Sizes size;
    private double price;
    private String color;

    public Clothes(String type, Sizes size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    public Clothes(String type, Sizes size, String color, double price) {
        this(type, size, color);
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

//Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.