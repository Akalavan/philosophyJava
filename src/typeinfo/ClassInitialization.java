package typeinfo;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal12 = ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Init Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("init Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Init Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After creating link on Initable");
        // DO not start process init:
        System.out.println(Initable.staticFinal);
        // Start process init:
        System.out.println(Initable.staticFinal12);
        // Start process init:
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("typeinfo.Initable3");
        System.out.println("After creating link on Initablee3");
        System.out.println(Initable3.staticNonFinal);
    }
}
