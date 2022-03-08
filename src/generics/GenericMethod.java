package generics;

public class GenericMethod {
    public <T, E, C> void f(T x, E e, C c) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.f("", 1, 1.0);
        gm.f(1.0f, 'c', gm);
    }
}
