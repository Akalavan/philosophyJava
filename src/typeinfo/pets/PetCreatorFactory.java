package typeinfo.pets;

import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreatorFactory {

    private Random rand = new Random(47);

    public abstract List<Factory<? extends Pet>> types();

    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        return types().get(n).create();
    }

    public Pet[] createArray(int size) {
        Pet[] pets = new Pet[size];

        for (int i = 0; i < size; i++) {
            pets[i] = randomPet();
        }

        return pets;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> pets = new ArrayList<>();
        Collections.addAll(pets, createArray(size));
        return pets;
    }

}
