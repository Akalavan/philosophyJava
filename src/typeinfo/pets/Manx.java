package typeinfo.pets;

import typeinfo.factory.Factory;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Manx> {

    @Override
    public Manx create() {
      return new Manx();
    }
  }
} ///:~
