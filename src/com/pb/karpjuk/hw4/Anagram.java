package com.pb.karpjuk.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static String StrProcedure(String strin) {
        String str11 = "";

        String[] words1 = strin.split("([^а-яА-Яa-zA-Z']+)'*\\1*");

        for (int i = 0; i < words1.length; i++) {
            //System.out.print(words1[i]);
            str11 += words1[i].toLowerCase();
        }

        char[] str11Sort = str11.toCharArray();
        Arrays.sort(str11Sort);
        String str11Sort1 = new String(str11Sort);
        //System.out.println(str11Sort1);

        return str11Sort1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String strEnd = "";

        System.out.println("Вітаю! Це програма на перевірку чи 2 тексти являються анаграмами");

        System.out.print("Введіть текст1: ");
        String str1 = scan.nextLine();

        System.out.println("");
        System.out.print("Введіть текст2: ");
        String str2 = scan.nextLine();

        System.out.println("");

        //final
        System.out.print("ВИСНОВОК: Введені вами тексти ");
        if (StrProcedure(str1).equals(StrProcedure(str2))) {
            System.out.println("є анаграмами!");
        } else {
            System.out.println("не є анаграмами!");
        }
        //System.out.println(str11Sort1.equals(str21Sort1));
    }
}

//Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
        //Обе строки вводит пользователь.
        //Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
        //Программа должна игнорировать пробелы и знаки препинания.
        //Пример анаграмм:
        //Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
        //Я в мире — сирота. -> Я в Риме — Ариост.
        //При выполнении задания использовать метод(ы).
