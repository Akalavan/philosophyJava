package typeinfo;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import util.TypeCounter;

import java.lang.reflect.InvocationTargetException;

import static util.Print.print;
import static util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet p :
                Pets.createArray(20)) {
            printnb(p.getClass().getSimpleName() + " ");
            counter.count(p);
        }
        print();
        print(counter);

        TypeCounter counterCoffee = new TypeCounter(Coffee.class);

        for (Coffee c :
                new CoffeeGenerator(10)) {
            printnb(c.getClass().getSimpleName() + " ");
            counterCoffee.count(c);
        }

        print();
        print(counterCoffee);

        TypeCounter counterFilter = new TypeCounter(Part.class);

        for (int i = 0; i < 10; i++) {
            Part p = Part.createRandom();
            printnb(p.getClass().getSimpleName() + " ");
            counterFilter.count(p);
        }

        print();
        print(counterFilter);
    }



}
