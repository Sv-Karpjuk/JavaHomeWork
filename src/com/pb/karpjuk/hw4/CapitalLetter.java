package com.pb.karpjuk.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String CapitalisationLetter(String nname) {
        String strEnd = "";
        String[] words = nname.split(" ");
        for (String word : words) {
            if (word.length() > 0) { // костиль від помилки, якщо пусто або кілька пробілів
                strEnd += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            } else {
                strEnd += " "; // зберігає початкову к-сть пробілів
            }
        }
        return strEnd;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String strEnd = "";

        System.out.print("Введіть текст: ");
        String strSta = scan.nextLine();

        System.out.println("БУЛО:  " + strSta);
        System.out.print("СТАЛО: " + CapitalisationLetter(strSta));
    }
}

// Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
// Строку должен ввести пользователь.
// Пример работы:
// Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
// Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
// При выполнении задания использовать метод(ы).
