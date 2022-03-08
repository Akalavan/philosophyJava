package typeinfo;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import util.TypeCounter;

import static util.Print.print;
import static util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet p :
                Pets.createArray(20)) {
            printnb(p.getClass().getSimpleName() + " ");
            counter.count(p);
        }
        print();
        print(counter);
    }
}
