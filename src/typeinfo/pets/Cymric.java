package typeinfo.pets;

import typeinfo.factory.Factory;

public class Cymric extends Manx {
  public Cymric(String name) { super(name); }
  public Cymric() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Cymric> {

    @Override
    public Cymric create() {
      return new Cymric();
    }
  }
} ///:~
