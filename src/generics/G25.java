package generics;

interface One {
    void f();
}

interface Two {
    void g();
}

class GeneticInt implements One, Two {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}

public class G25 {

    static <T extends One> void one(T t) {
        t.f();
    }

    static <T extends Two> void two(T t) {
        t.g();
    }

    public static void main(String[] args) {
        GeneticInt gi = new GeneticInt();
        one(gi);
        two(gi);
    }
}
