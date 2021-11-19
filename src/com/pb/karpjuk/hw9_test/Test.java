package com.pb.karpjuk.hw9_test;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        String line = "12 23 34 56 11 23";

        String numbers[] = line.split (" ");

        System.out.println(Integer.parseInt(numbers[3]));

    }
}
