package typeinfo;

import typeinfo.factory.Factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {

    public String toString() {
        return getClass().getSimpleName();
    }

    static List<? super Part> partFactories = new ArrayList<>();

    static {
        partFactories.add(new FuelFilter());
        partFactories.add(new AirFilter());
        partFactories.add(new CabinAirFilter());
        partFactories.add(new OilFilter());
        partFactories.add(new FanBelt());
        partFactories.add(new GeneratorBelt());
        partFactories.add(new PowerSteerBelt());
    }

    private static Random rand = new Random(47);
//
//    public static Part createRandom() {
//        int n = rand.nextInt(partFactories.size());
//        return partFactories.get(n).create();
//    }

    public static Part createRandom() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int n = rand.nextInt(partFactories.size());

        return (Part) partFactories.get(n).getClass().getDeclaredConstructor().newInstance();

    }

}

class Filter extends Part {}

class FuelFilter extends Filter {

    public static class Factory implements typeinfo.factory.Factory<FuelFilter> {
        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }

}

class AirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<AirFilter> {
        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<CabinAirFilter> {
        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<OilFilter> {
        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {

    public static class Factory implements typeinfo.factory.Factory<FanBelt> {
        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {

    public static class Factory implements typeinfo.factory.Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }

}

class PowerSteerBelt extends Belt {

    public static class Factory implements typeinfo.factory.Factory<PowerSteerBelt> {
        @Override
        public PowerSteerBelt create() {
            return new PowerSteerBelt();
        }
    }

}

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Part.createRandom());
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
