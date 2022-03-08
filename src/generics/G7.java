package generics;

import java.util.Iterator;

public class G7 implements Iterable<Integer> {

    private int n;
    private Fibonacci fibonacci = new Fibonacci();

    public G7(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i :
                new G7(18)) {
            System.out.print(i + " ");
        }
    }
}
