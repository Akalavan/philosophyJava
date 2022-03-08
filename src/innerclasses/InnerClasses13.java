package innerclasses;

public class InnerClasses13 {
    InnerClasses13(int x) {

    }

    public void f() {
        System.out.println("IC.f()");
    }
}

class two {
    public static InnerClasses13 innerClasses13() {
        return new InnerClasses13(11) {
            @Override
            public void f() {
                System.out.println("anonymous.f()");
            }
        };
    }

    public static void main(String[] args) {
        innerClasses13().f();
    }
}
