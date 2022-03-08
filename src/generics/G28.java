package generics;

import java.util.List;

class Generic1<T> {
    void f(T t) {

    }
}

class Generic2<T> {
    T f() {
        return null;
    }
}

public class G28 {

    static <T> void f3(Generic1<? super T> g) {
        Generic2<T> g2 = new Generic2<>();
        g.f(g2.f());
    }

    public static void main(String[] args) {
        Generic1<String> g1 = new Generic1<>();
        f3(g1);
    }
}
