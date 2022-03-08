package holding;

import typeinfo.pets.*;
import util.New;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static util.Print.print;

public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPeople = New.map();

    static {
        petPeople.put(new Person("Down"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
        petPeople.put(new Person("Marlyn"), Arrays.asList(
                new Pug("Louie"),
                new Cat("Stanford"),
                new Cat("Pinkola")
        ));
        petPeople.put(new Person("Luke"), Arrays.asList(
                new Rat("Fuzzy"),
                new Rat("Fizzy")
        ));
        petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
    }

    public static void main(String[] args) {
        print("People: " + petPeople.keySet());
        print("Pets: " + petPeople.values());

        for (Person person :
                petPeople.keySet()) {
            print(person + " has:");
            for (Pet pet :
                    petPeople.get(person)) {
                print("    " + pet);
            }
        }
    }
}
