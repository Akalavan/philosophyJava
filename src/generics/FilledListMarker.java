package generics;

import java.util.ArrayList;
import java.util.List;

public class FilledListMarker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMarker<String> stringMarker = new FilledListMarker<>();
        List<String> list = stringMarker.create("Hello", 4);
        System.out.println(list);
    }

}
