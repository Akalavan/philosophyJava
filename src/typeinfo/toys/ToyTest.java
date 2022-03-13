package typeinfo.toys;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;

import static util.Print.print;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Runs {}

class Toy {
    int i;

    Toy() {}
    Toy(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "i=" + i +
                '}';
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Runs {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {

    static void printInfo(Class cc) {
        print("Name class: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Not found FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face :
                c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Error creating");
            System.exit(1);
        }  catch (IllegalAccessException e) {
            print("access denied");
            System.exit(1);
        }
        printInfo(obj.getClass());
        System.out.println("===================");
        Toy toy = null;
        try {
            Class<?> t = Class.forName("typeinfo.toys.Toy");
            Constructor<?>[] cons = t.getDeclaredConstructors();

            for (Constructor<?> con: cons) {
                if (con.getParameterCount() > 0)
                    for (Class<?> cls: con.getParameterTypes()) {
                        if (cls.equals(int.class)) {
                            try {
                                toy = (Toy) con.newInstance(2);
                            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(toy);

    }
}
