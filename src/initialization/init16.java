package initialization;

import java.util.Arrays;

public class init16 {
    public static void main(String[] args) {
        String[] s = new String[4];
        Arrays.setAll(s, i -> i + "!");
        System.out.println(Arrays.toString(s));
    }
}
