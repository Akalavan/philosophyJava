package generics;

import typeinfo.Person;
import typeinfo.pets.Pet;
import util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.map());
        f(New.<Person, List<? extends Pet>>map());
    }
}
