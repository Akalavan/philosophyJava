package generics;

import java.util.HashMap;
import java.util.Map;

class Building {
    public static class Factory implements FactoryI<Building> {

        @Override
        public Building create() {
            return new Building();
        }
    }
}
class House extends Building {

    public static class Factory implements FactoryI<House> {

        @Override
        public House create() {
            return new House();
        }
    }
}


public class ClassTypeCapture<T> {
    Map<String, FactoryI<?>> map = new HashMap<>();
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    void addType(String typename, FactoryI<?> kind) {
        map.put(typename, kind);
    }

    Object createNew(String typename) {
        try {
            return map.get(typename).create();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));

        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        ctt1.addType("Integer", new IntegerFactory());
        ctt1.addType("House", new House.Factory());
        ctt1.addType("Building", new Building.Factory());
        Integer i = (Integer) ctt1.createNew("Integer");
        System.out.println(i);
        House h = (House) ctt1.createNew("House");
        System.out.println(h);
        Building b = (Building) ctt1.createNew("Building");
        System.out.println(b);
    }
}
