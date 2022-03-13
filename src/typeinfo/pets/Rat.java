package typeinfo.pets;

import typeinfo.factory.Factory;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Rat> {

    @Override
    public Rat create() {
      return new Rat();
    }
  }
} ///:~
