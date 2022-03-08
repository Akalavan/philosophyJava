package polymorphism.cycle;

import polymorphism.cycle.Cycle;

public class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("Tricycle.ride();" + " Wheels = " + wheels());
    }

    @Override
    public int wheels() {
        return 3;
    }
}
