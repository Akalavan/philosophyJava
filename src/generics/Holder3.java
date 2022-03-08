package generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.getA();
        //h3.setA("str");
       // h3.setA(1);
        Holder3<Pet> h3P = new Holder3<>(new Pet());
        h3P.setA(new Cat());
    }
}
