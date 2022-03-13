package typeinfo.pets;

import typeinfo.factory.Factory;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Dog> {

    @Override
    public Dog create() {
      return new Dog();
    }
  }
} ///:~
