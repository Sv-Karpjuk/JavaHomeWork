package com.pb.karpjuk.hw12_test;

import java.util.Arrays;
import java.util.List;

public class TestLambda2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            System.out.println(number);

            System.out.println("Через лямбда");

            numbers.forEach((Integer value) -> System.out.println(value));

            System.out.println("Через ::");

            numbers.forEach(System.out::println);
        }
    }
}