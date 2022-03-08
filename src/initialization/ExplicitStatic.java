package initialization;

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static String s = "s";
    static Cup cup1;
    static Cup cup2;
    static  {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
        f();
        s = "ss";
    }

    Cups() {
        System.out.println("Cups()");
    }

    static void f() {
        System.out.println(s);
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
       // Cups.cup1.f(99);
        Cups.f();
    }
    //static Cups cups1 = new Cups();
    //static Cups cups2 = new Cups();
}
