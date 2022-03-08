package generics;

import static util.Tuple.tuple;

public class TupleTest2 {

    static TwoTuple<String, Integer> f() {
        return tuple("h1", 47);
    }

    static TwoTuple f2() {
        return tuple("h1", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        TwoTuple<String, Integer> ttsi2 = f2();
        System.out.println(ttsi2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
