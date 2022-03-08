package polymorphism.cycle;

import polymorphism.cycle.Bicycle;
import polymorphism.cycle.Cycle;
import polymorphism.cycle.Tricycle;
import polymorphism.cycle.Unicycle;

public class Poli1 {
    public static void transport(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Tricycle tricycle = new Tricycle();

        transport(bicycle);
        transport(unicycle);
        transport(tricycle);

    }
}
