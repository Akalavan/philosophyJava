package innerclasses;

import innerclasses.controller.Event;

public class In23 extends GreenHouseControls {
    private boolean humidification = false;

    public class HumidificationOn extends Event {

        public HumidificationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification = true;
        }

        public String toString() {
            return "Humidification on";
        }
    }

    public class HumidificationOff extends Event {

        public HumidificationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification = false;
        }

        public String toString() {
            return "Humidification off";
        }
    }
}
