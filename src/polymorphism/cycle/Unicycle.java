package polymorphism.cycle;

import polymorphism.cycle.Cycle;

public class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Unicycle.ride();" + " Wheels = " + wheels());
    }

    @Override
    public int wheels() {
        return 1;
    }
}
