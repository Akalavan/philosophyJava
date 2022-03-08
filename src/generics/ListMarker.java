package generics;

import java.util.ArrayList;
import java.util.List;

public class ListMarker<T> {
    List<T> create() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ListMarker<String> stringMarker = new ListMarker<>();
        List<String> stringList = stringMarker.create();
    }
}
