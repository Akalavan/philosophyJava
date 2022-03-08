package exceptions;

import static util.Print.print;

class MyExceptions2 extends Exception {
    private int x;
    public MyExceptions2() {}

    public MyExceptions2(String msg) {
        super(msg);
    }

    public MyExceptions2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message: "+ x + " "+ super.getMessage();
    }
}

public class ExtraFeature {
    public static void f() throws MyExceptions2 {
        print("Throw MyExceptions2 from f()");
        throw new MyExceptions2();
    }

    public static void g() throws MyExceptions2 {
        print("Throw MyExceptions2 from g()");
        throw new MyExceptions2("Created in g()");
    }

    public static void h() throws MyExceptions2 {
        print("Throw MyExceptions2 from h()");
        throw new MyExceptions2("Created in h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyExceptions2 e) {
            e.printStackTrace(System.err);
        }
        try {
            g();
        } catch (MyExceptions2 e) {
            e.printStackTrace(System.err);
        }
        try {
            h();
        } catch (MyExceptions2 e) {
            e.printStackTrace(System.err);
            System.out.println("e.val() = " + e.val());
        }
    }
}