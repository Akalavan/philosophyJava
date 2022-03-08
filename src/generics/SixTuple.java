package generics;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {

    public final F six;

    public SixTuple(A first, B second, C three, D fourth, E five, F six) {
        super(first, second, three, fourth, five);
        this.six = six;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "six=" + six +
                ", five=" + five +
                ", fourth=" + fourth +
                ", three=" + three +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
