package com.pb.karpjuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nnum;

        nnum = scan.nextInt();

        if (nnum >= 0 && nnum <= 14 ) {
            System.out.println("[0 -14]");
        } else {
            if (nnum >= 15 && nnum <= 35 ) {
                System.out.println("[15 -35]");
            }
            else {
                if (nnum >= 36 && nnum <= 50 ) {
                    System.out.println("[36 -50]");
            }
                else {
                    if (nnum >= 51 && nnum <= 100 ) {
                        System.out.println("[51 -100]");
                    }
                    else {
                        System.out.println("Поза діапазонами!");
                    }
                }
            }
        }
    }
}

