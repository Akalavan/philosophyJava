package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };

            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> petList = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(petList);
                return petList.iterator();
            }
        };
    }



    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.randomized().iterator());

        for (Pet pet: nc.randomized()) {
            System.out.print(pet + "; ");
        }
    }
}
