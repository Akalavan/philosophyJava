package typeinfo.pets;

import typeinfo.factory.Factory;

public class Mutt extends Dog {
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Mutt> {

    @Override
    public Mutt create() {
      return new Mutt();
    }
  }
} ///:~
