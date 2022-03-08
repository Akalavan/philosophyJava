package object;

public class object1 {
    int i;
    char c;

    public static void main(String[] args) {
        object1 object1 = new object1();
        object1.f();
    }

    void f(){
        System.out.println(i);
        System.out.println(c);
    }
}
