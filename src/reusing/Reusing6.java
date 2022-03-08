package reusing;

class Amphibian {
    public void A() {
        System.out.println("Amphibian.A");
    }
    public void B() {
        System.out.println("Amphibian.B");
    }
}

class Frog extends Amphibian {
    @Override
    public void A() {
        System.out.println("Frog.B");
    }

    @Override
    public void B() {
        System.out.println("Frog.B");
    }

    private void C() {
        System.out.println("Frog.C");
    }
}

public class Reusing6 {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.A();
        amphibian.B();
    }
}
