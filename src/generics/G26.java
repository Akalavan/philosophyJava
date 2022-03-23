package generics;

import java.util.ArrayList;
import java.util.List;

public class G26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = 1;

        List<? extends Number> num = new ArrayList<Integer>();
        //num.add(2);
    }
}
