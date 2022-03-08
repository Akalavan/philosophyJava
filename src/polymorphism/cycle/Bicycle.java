package polymorphism.cycle;

public class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Bicycle.ride();" + " Wheels = " + wheels());
    }

    @Override
    public int wheels() {
        return 2;
    }
}
