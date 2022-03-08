package initialization;

class Tree {
    int height;

    public Tree() {
        System.out.println("We plant a sprout");
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
        System.out.println("Creating new wood height " + height + " m.");
    }

    void info() {
        System.out.println("The wood is height " + height + " m.");
    }

    void info(String s) {
        System.out.println(s + ": The wood is height " + height + " m.");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Overloading method");
        }
        new Tree();
    }
}
