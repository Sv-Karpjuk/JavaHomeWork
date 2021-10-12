package com.pb.karpjuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        operand1 = scan.nextInt();
        operand2 = scan.nextInt();
        sign = scan.next();

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