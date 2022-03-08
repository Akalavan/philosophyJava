package initialization;

class A {

}

public class NewVarArgs {
    static void printArray(Object...args) {
        for (Object obg :
                args) {
            System.out.print(obg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(47, 3.14f, new Double(11.11));
        printArray(47, 3.14f, 11.11);
        printArray("раз", "два", "три");
        printArray(new A(), new A(), new A());

        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();
    }
}
