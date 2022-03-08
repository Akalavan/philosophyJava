package innerclasses;

public class In24 {
    class Inner {
        Inner(String s) {
            System.out.println(s);
        }
    }
}

class In24_2 {
    class Inner_2 extends In24.Inner {

        Inner_2(In24 i, String s) {
            i.super(s);
        }
    }

    public static void main(String[] args) {

    }
}
