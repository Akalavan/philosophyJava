package innerclasses.zd21;

public interface U {
    void x();
    void y();
    void z();
}

class A {
    U u() {
        return new U() {
            @Override
            public void x() {

            }

            @Override
            public void y() {

            }

            @Override
            public void z() {

            }
        };
    }
}

class B {
    U[] us = new U[3];
    void masU(U u, int i) {
        us[i] = u;
    }

    void sbros(int i) {
        us[i] = null;
    }

    void perebor() {
        for (U u :
                us) {
            u.x();
            u.y();
            u.z();
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.masU(a1.u(), 0);
        b.masU(a2.u(), 1);
        b.masU(a3.u(), 2);
        b.perebor();
        b.sbros(1);
        b.perebor();
    }
}
