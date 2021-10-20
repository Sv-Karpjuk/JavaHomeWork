package com.pb.karpjuk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("input mas len: ");

        int sSum, cntPositive;

        //int x = scanner.nextInt();
        int x = 10;

        int[] array = new int[x];

        sSum = 0;
        cntPositive = 0;

        System.out.println("Введіть масив цілих чисел з 10 елементів: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sSum += array[i];
            if (array[i] > 0) {
                cntPositive++;
            }
        }

        System.out.print("Введенний масив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Сума всіх елементів масиву: " + sSum);
        System.out.println("К-сть додатніх елементів: " + cntPositive);

        //Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)

        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        System.out.print("Відсортований масив: ");
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    }
}
