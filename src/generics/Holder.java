package generics;

public class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) {
        value = val;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.getValue();
        Apple.setValue(d);

        //Holder<Fruit> fruit = Apple;
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.getValue();
        d = (generics.Apple) fruit.getValue();
        try {
            Orange c = (Orange) fruit.getValue();
        } catch (Exception e) {
            System.out.println(e);
        }

       // fruit.setValue(new Apple());
       // fruit.setValue(new Fruit());
        System.out.println(fruit.equals(d));
    }
}
