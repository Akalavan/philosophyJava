package typeinfo.pets;

import typeinfo.factory.Factory;

public class Rodent extends Pet {
  public Rodent(String name) { super(name); }
  public Rodent() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Rodent> {

    @Override
    public Rodent create() {
      return new Rodent();
    }
  }
} ///:~
