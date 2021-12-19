package com.pb.karpjuk.hw12_test;

public class TestLambda {
    public static void main(String[] args) {
        Operationable sum;
        Operationable minus;
        sum = (x, y) -> x + y;
        minus = (x, y) -> x - y;
        System.out.println(sum.calculate(20, 10));
        System.out.println(minus.calculate(20, 10));
    }
}
interface Operationable{
    int calculate(int x, int y);
}
