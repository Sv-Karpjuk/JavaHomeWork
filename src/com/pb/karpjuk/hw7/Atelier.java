package com.pb.karpjuk.hw7;

public class Atelier {

    static void dressMan(Clothes[] clothes) {
        System.out.println("Одягнути чоловіка:");
        for (Clothes iClothes : clothes) {
            if (iClothes instanceof ManClothes) {
                System.out.println(iClothes.getType() + ": " +
                        "розмір - " + iClothes.getSize() +
                        ", ціна - " + iClothes.getPrice() + " грн." +
                        ", колір - " + iClothes.getColor());
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println("Одягнути жінку:");
        for (Clothes iClothes : clothes) {
            if (iClothes instanceof WomenClothes) {
                System.out.println(iClothes.getType() + ": " +
                        "розмір - " + iClothes.getSize() +
                        ", ціна - " + iClothes.getPrice() + " грн." +
                        ", колір - " + iClothes.getColor());
            }
        }
    }

    public static void main(String[] args) {

        //создать массив, содержащий все типы одежды
        Clothes[] iClothes = new Clothes[12];
        iClothes[0] = new Pants(Sizes.XXS, "фіалковий", 779);
        iClothes[1] = new Pants(Sizes.XS, "золотий", 769);
        iClothes[2] = new Pants(Sizes.L, "кавовий", 799);

        iClothes[3] = new Skirt(Sizes.XXS, "сіро-буро-малиновий", 599);
        iClothes[4] = new Skirt(Sizes.M, "коричневий", 699);
        iClothes[5] = new Skirt(Sizes.L, "агонь", 555);

        iClothes[6] = new Tshirt(Sizes.XXS, "персиковий", 399);
        iClothes[7] = new Tshirt(Sizes.S, "сіро-мандариновий", 299);
        iClothes[8] = new Tshirt(Sizes.M, "мегаколор", 359);

        iClothes[9] = new Tie(Sizes.XS, "шкіра буйвола", 999);
        iClothes[10] = new Tie(Sizes.S, "яйця дятла", 777);
        iClothes[11] = new Tie(Sizes.M, "ейфелева вежа", 11111);

        //поправочки
        iClothes[10].setColor("яйця буйвола");
        iClothes[11].setPrice(1111);

        Atelier atelier = new Atelier();

        //вызвать методы dressMan и dressWomen передав туда этот массив
        atelier.dressMan(iClothes);
        System.out.println();
        atelier.dressWomen(iClothes);

    }
}

//Создать класс Atelier с методом main, и еще двумя статическими методами:
//dressMan(Clothes[] clothes)
//dressWomen(Clothes[] clothes)
// вход которых будет поступать массив, содержащий все типы одежды.
//В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
//Метод dressMan выводит на консоль всю информацию о мужской одежде.
//Метод dressWomen выводит на консоль всю информацию о женской одежде.
//В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.
