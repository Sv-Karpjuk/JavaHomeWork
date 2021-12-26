package com.pb.karpjuk.hw13_test.s12TEST_DELETE;

import java.util.ArrayList;
import java.util.List;

public class ttt {
    public static void main(String[] args) {

        List<Integer> buffer1 = new ArrayList<>();

        buffer1.add(1);
        buffer1.add(2);
        buffer1.add(null);

        System.out.println("Буфер:" + buffer1);

        buffer1.remove(0);
        System.out.println("Буфер:" + buffer1);


        for (int i = 0; i < buffer1.size(); i++) {
            if (buffer1.get(i) == 2) {
                buffer1.remove(i);
            }
            if (buffer1.get(i) == null) {
                buffer1.remove(i);
            }
        }

        System.out.println("Буфер:" + buffer1);

    }
}
