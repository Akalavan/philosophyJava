package typeinfo.pets;

import typeinfo.factory.Factory;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Pug> {

    @Override
    public Pug create() {
      return new Pug();
    }
  }
} ///:~
