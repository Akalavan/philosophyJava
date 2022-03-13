package typeinfo.pets;

import typeinfo.factory.Factory;

public class EgyptianMau extends Cat {
  public EgyptianMau(String name) { super(name); }
  public EgyptianMau() { super(); }

  public static class Factory implements typeinfo.factory.Factory<EgyptianMau> {

    @Override
    public EgyptianMau create() {
      return new EgyptianMau();
    }
  }
} ///:~
