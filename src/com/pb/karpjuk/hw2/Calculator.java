package com.pb.karpjuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введіть число1: ");
        operand1 = scan.nextInt();
        System.out.print("Введіть число2: ");
        operand2 = scan.nextInt();
        System.out.print("Введіть дію: ");
        sign = scan.next();
        System.out.print("РЕЗУЛЬТАТ: ");

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ділення на нуль!");
                } else {
                    System.out.println(1.0 * operand1 / operand2);
                }
                break;
            default:
                System.out.println("Такого ще не вмію робити!");
        }
    }
}