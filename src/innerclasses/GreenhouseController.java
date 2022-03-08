package innerclasses;

import innerclasses.controller.Event;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenHouseControls gc = new GreenHouseControls();
        In23 in23 = new In23();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new WindOn(1000),
                gc.new WindOff(1200),
                in23.new HumidificationOn(1400),
                in23.new HumidificationOff(1600),
                gc.new ThermostatDay(1800)

        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenHouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
