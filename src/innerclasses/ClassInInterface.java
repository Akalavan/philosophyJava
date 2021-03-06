package innerclasses;

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {

        @Override
        public void howdy() {
            System.out.println("Hi");
        }

        public static void main(String[] args) {
            new Test().howdy();
            ClassInInterface c = new Test();
            c.howdy();
        }
    }
}
