package generics;

public interface G20 {

    void f();
    void x();
}

class ImpG20 implements G20 {

    @Override
    public void f() {
        System.out.println("f()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    public void y() {

    }
}

class GenericMethodG20 {

    <T extends G20> void z(T x) {
        T obj = x;
        obj.f();
        obj.x();
    }

    public static void main(String[] args) {
        GenericMethodG20 g20 = new GenericMethodG20();
        g20.z(new ImpG20());
    }
}