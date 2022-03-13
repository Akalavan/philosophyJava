package typeinfo.pets;

import typeinfo.factory.Factory;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Hamster> {

    @Override
    public Hamster create() {
      return new Hamster();
    }
  }
} ///:~
