package generics;

abstract class SelfBoundedG34<T extends SelfBoundedG34<T>> {
    abstract <T extends SelfBoundedG34<T>> T f(T t);

    T f2(){
        return (T) f(new G34());
    }
}

public class G34 extends SelfBoundedG34<G34> {


    public static void main(String[] args) {
        G34 g341 = new G34();
        G34 g34 = g341.f2();
    }

    @Override
    <T extends SelfBoundedG34<T>> T f(T t) {
        return t;
    }
}
