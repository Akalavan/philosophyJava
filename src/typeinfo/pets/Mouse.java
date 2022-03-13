package typeinfo.pets;

import typeinfo.factory.Factory;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }

  public static class Factory implements typeinfo.factory.Factory<Mouse> {

    @Override
    public Mouse create() {
      return new Mouse();
    }
  }
} ///:~
