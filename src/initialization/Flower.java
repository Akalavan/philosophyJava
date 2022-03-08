package initialization;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with parameter int, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor with parameter String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("Arguments String and int");
    }

    Flower() {
        this("hi", 47);
        System.out.println("Default constructor (without args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
