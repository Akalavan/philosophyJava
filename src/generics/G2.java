package generics;

public class G2<T> {
    private T x1;
    private T x2;
    private T x3;

    public G2(T x1, T x2, T x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public T getX1() {
        return x1;
    }

    public void setX1(T x1) {
        this.x1 = x1;
    }

    public T getX2() {
        return x2;
    }

    public void setX2(T x2) {
        this.x2 = x2;
    }

    public T getX3() {
        return x3;
    }

    public void setX3(T x3) {
        this.x3 = x3;
    }
}
