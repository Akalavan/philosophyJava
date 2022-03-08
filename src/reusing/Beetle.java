package reusing;

import static util.Print.print;

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i= " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("Field static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Field Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");

}

class Ant extends Beetle {
    private int l = printInit("Field Ant.l initialized");
    public Ant() {
        print("l = " + l);
        print("j = " + j);
    }
    private static int x3 = printInit("static Ant.x3 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Ant b = new Ant();
    }
}
