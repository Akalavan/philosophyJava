package generics;

import typeinfo.pets.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new typeinfo.pets.Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        oldStyleMethod(dogs);
        List<Dog> dogs1 = Collections.checkedList(new ArrayList<>(), Dog.class);

        try {
            oldStyleMethod(dogs1);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Pet> pets = Collections.checkedList(new ArrayList<>(), Pet.class);

        pets.add(new Dog());
        pets.add(new typeinfo.pets.Cat());

    }
}
