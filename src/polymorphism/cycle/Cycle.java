package polymorphism.cycle;

public class Cycle {
    public void ride() {
        System.out.println("Cycle.ride;" + " Wheels = " + wheels());
    }
    public int wheels() {
        return 0;
    }
}
