package typeinfo.pets;

import typeinfo.factory.Factory;

public class Cat extends Pet {
  public Cat(String name) { super(name); }
  public Cat() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Cat> {
    @Override
    public Cat create() {
      return new Cat();
    }
  }

} ///:~
