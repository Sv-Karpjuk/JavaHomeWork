package com.pb.karpjuk.hw7;

enum Sizes {
    XXS ("(дитячий розмір)", 32),
    XS ("(дорослий розмір)", 34),
    S ("(дорослий розмір)", 36),
    M ("(дорослий розмір)", 38),
    L ("(дорослий розмір)", 40);

    private int euroSize;
    private String description;

    Sizes(String description, int euroSize) {
        this.euroSize = euroSize;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    @Override
    public String toString() {
        return name() + " (euro: " + euroSize + ") " + getDescription();
    }

}

//перечисление (enum) Size со значениями XXS, XS, S, M, L.
// Перечисление содержит метод getDescription(), возвращающий строку для XXS "Детский размер",
// для остальных "Взрослый размер".
// Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение
// (32, 34, 36, 38, 40) соответствующее каждому размеру.