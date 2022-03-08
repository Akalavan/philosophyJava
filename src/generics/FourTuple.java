package generics;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {

    public final D fourth;

    public FourTuple(A first, B second, C three, D fourth) {
        super(first, second, three);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "fourth=" + fourth +
                ", three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
