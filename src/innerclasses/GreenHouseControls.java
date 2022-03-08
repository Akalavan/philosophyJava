package innerclasses;

import innerclasses.controller.Controller;
import innerclasses.controller.Event;

public class GreenHouseControls extends Controller {
    private boolean light = false;
    private boolean water = false;
    private boolean wind = false;
    private String thermostat = "Day";

    public class LightOn extends Event {

        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        public String toString() {
            return "Light on";
        }
    }

    public class LightOff extends Event {

        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        public String toString() {
            return "Light off";
        }
    }

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString() {
            return "Watering on";
        }
    }

    public class WaterOff extends Event {

        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        public String toString() {
            return "Watering off";
        }
    }

    public class WindOn extends Event {

        public WindOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wind = true;
        }

        public String toString() {
            return "Airing on";
        }
    }

    public class WindOff extends Event {

        public WindOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            wind = false;
        }

        public String toString() {
            return "Airing off";
        }
    }

    public class ThermostatNight extends Event {

        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "The thermostat uses night mode";
        }

    }

    public class ThermostatDay extends Event {

        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        public String toString() {
            return "The thermostat uses day mode";
        }

    }

    public class Bell extends Event {

        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Bam!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e :
                    eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e :
                    eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        public String toString() {
            return "Restarting the system";
        }
    }

    public static class Terminate extends Event {

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Disabling";
        }
    }
}
