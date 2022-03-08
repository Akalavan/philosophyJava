package typeinfo;

import java.util.ArrayList;
import java.util.List;

class CounterInteger {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElement) {
        List<T> result = new ArrayList<T>();

        try {
            for (int i = 0; i < nElement; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static void main(String[] args) {
        FilledList<CounterInteger> f1 = new FilledList<>(CounterInteger.class);
        System.out.println(f1.create(15));
    }
}
