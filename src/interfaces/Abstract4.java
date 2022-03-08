package interfaces;

abstract public class Abstract4 {
    abstract public void f();
}

class A extends Abstract4 {

    public void f() {
        System.out.println("A.f()");
    }

    static void stat(Abstract4 abstract4) {
        abstract4.f();
    }

    public static void main(String[] args) {
        A a = new A();
        stat(a);
    }
}
