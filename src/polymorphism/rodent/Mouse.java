package polymorphism.rodent;

public class Mouse extends Rodent {
    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void sleep() {
        System.out.println("Mouse.sleep()");
    }
}
