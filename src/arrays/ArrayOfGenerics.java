package arrays;

import generics.Cat;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<>();

        //ls[1] = new ArrayList<Integer>();
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<Integer>[] listInt = (List<Integer>[]) new List[10];
        for (int i = 0; i < listInt.length; i++) {
            listInt[i] = new ArrayList<>(i * i);
        }
    }
}
