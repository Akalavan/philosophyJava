package typeinfo.pets;

import typeinfo.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryPetCreator extends PetCreatorFactory {

    static List<Factory<? extends Pet>> petFactory = new ArrayList<>();

    static {
        petFactory.add(new Manx.Factory());
    //    petFactory.add(new Cat.Factory());
        petFactory.add(new Cymric.Factory());
        //petFactory.add(new Dog.Factory());
        petFactory.add(new EgyptianMau.Factory());
        petFactory.add(new Gerbil.Factory());
        petFactory.add(new Hamster.Factory());
        petFactory.add(new Manx.Factory());
        petFactory.add(new Mouse.Factory());
        petFactory.add(new Pug.Factory());
        petFactory.add(new Rat.Factory());
    //    petFactory.add(new Rodent.Factory());
    }


    @Override
    public List<Factory<? extends Pet>> types() {
        return petFactory;
    }
}
