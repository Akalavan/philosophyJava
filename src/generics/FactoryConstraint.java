package generics;

import typeinfo.factory.Factory;

interface FactoryI<T> {
    T create(int i);
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create(1);
    }
}

class IntegerFactory implements FactoryI<Integer> {
    public Integer create(int i) {
        return 0;
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create(int i) {
            return new Widget();
        }
    }
}



public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
