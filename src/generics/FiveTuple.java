package generics;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

    public final E five;

    public FiveTuple(A first, B second, C three, D fourth, E five) {
        super(first, second, three, fourth);
        this.five = five;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "five=" + five +
                ", fourth=" + fourth +
                ", three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
