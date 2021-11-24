package com.pb.karpjuk.hw10;

public class Main {
    public static void main(String[] args) {

        //Integer
        NumBox<Integer> intSet1 = new NumBox<Integer>(3);

        System.out.println(intSet1);

        //intSet1.get(3);

        //вводимо масив цілих
        //intSet1.set(0, 1);
        //intSet1.set(1, 2);
        //intSet1.set(2, 3);

        try {
            intSet1.add(1);
            intSet1.add(999999);
            intSet1.add(3);
            intSet1.add(4); // це лишній елемент для перевірки
        } catch (Exception e1) {
            System.out.println("Увага! Масив " + intSet1 + " заповнений! Додати дані неможливо!");
        }

        //поправка ;)
        intSet1.set(1,2);

        //Вивід1
        System.out.println("element #2 = " + intSet1.get(1));
        System.out.println("Length = " + intSet1.length());
        System.out.println("Average = " + intSet1.average());
        System.out.println("Sum = " + intSet1.sum());
        System.out.println("Max = " + intSet1.max());

        System.out.println("");

        //Float
        NumBox<Float> intSet2 = new NumBox<Float>(5);

        System.out.println(intSet2);

        //intSet2.get(3);

        //вводимо масив дробових
        //intSet2.set(0, 1.11f);
        //intSet2.set(1, 2.22f);
        //intSet2.set(2, 3.33f);
        //intSet2.set(3, 4.44f);
        //intSet2.set(4, 5.55f);

        try {
            intSet2.add(1.11f);
            intSet2.add(2.22f);
            intSet2.add(3.33f);
            intSet2.add(4.44f);
            intSet2.add(5.55f);
            intSet2.add(6.66f); // це лишній елемент для перевірки
        } catch (Exception e2) {
            System.err.println("Увага! Масив " + intSet2 + " повністю заповнений! Додати дані неможливо!");
        }

        //Вивід2
        System.out.println("element #2 = " + intSet2.get(1));
        System.out.println("Length = " + intSet2.length());
        System.out.println("Average = " + intSet2.average());
        System.out.println("Sum = " + intSet2.sum());
        System.out.println("Max = " + intSet2.max());

    }
}

/*  класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>
*/
