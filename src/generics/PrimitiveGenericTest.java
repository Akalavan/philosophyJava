package generics;

import interfaces.RandomWords;
import util.Generator;

import java.util.Random;

class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen) {
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }
}

public class PrimitiveGenericTest {
    public static void main(String[] args) {
        String[] strings = FArray.fill(new String[7], new Generator<String>() {
            Random random = new Random();
            @Override
            public String next() {
                return String.valueOf(random.nextInt());
            }
        });

        for (String s :
                strings) {
            System.out.println(s);
        }

        Integer[] integers = FArray.fill(new Integer[7], new Generator<Integer>() {
            Random random = new Random();
            @Override
            public Integer next() {
                return random.nextInt();
            }
        });

        for (int i :
                integers) {
            System.out.println(i);
        }

//        int[] b = FArray.fill(new int[7], new Generator<Integer>() {
//            @Override
//            public Integer next() {
//                return null;
//            }
//        });
    }
}
