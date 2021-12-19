package com.pb.karpjuk.hw12_test.s02lambdas;

public class Main3 {

    @FunctionalInterface
    public interface Printable {
        void print(String s);
    }

    public static void main(String[] args) {
        doPrint(
                (s) -> {
                    System.out.println("length of '" + s + "' = " + s.length());
                    String rev = new StringBuilder(s).reverse().toString();
                    System.out.println("reverse: " + rev);
                }
        );
    }

    public static void doPrint(Printable printable) {
        System.out.println("start doPrintable");
        printable.print("Привет, меня зовут Вася");
        System.out.println("exit doPrintable");
    }
}
