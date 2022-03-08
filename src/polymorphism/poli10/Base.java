package polymorphism.poli10;

public class Base {
    public void A() {
        System.out.println("Base.A()");
        B();
    }

    public void B() {
        System.out.println("Base.B()");
    }
}

class Proivod extends Base {
    @Override
    public void B() {
        System.out.println("Proivod.B()");
    }

    public static void main(String[] args) {
        Proivod p = new Proivod();
        Base b = p;
        b.A();
    }
}
