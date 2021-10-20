package com.pb.karpjuk.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int rnd = (int) (Math.random() * 101);
        int nnum, counter;
        nnum = -100;
        counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("BINGO: Я загадав число від 0 до 100. Давай спробуємо його відгадати? Щоб здатися, введіть -1.");

        while (nnum != rnd) {
            System.out.print("Введіть число: ");
            nnum = scan.nextInt();
            if (nnum == -1) {
                System.out.print("BINGO: На жаль, ви вирішили здатися :(");
                break;
            }
            if (rnd > nnum) {
                System.out.println("Ха-ха, загадане число БІЛЬШЕ від " + nnum + ", cпробуйте ще раз...");
            }
            if (rnd < nnum) {
                System.out.println("Ха-ха, загадане число МЕНШЕ від " + nnum + ", cпробуйте ще раз...");
            }
            counter++;
        }
        if (rnd == nnum) {
            System.out.print("BINGO! Ви відгадали за " + counter + " ходів! Чи не хочете покращити результат? ;)");
        }
    }
}
