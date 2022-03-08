package generics;

class PerformingDog implements Performs {

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void sit() {
        System.out.println("Sitting");
    }

    public void reproduce() {}
}

class Robot implements Performs {
    @Override
    public void speak() {
        System.out.println("Click!");
    }

    @Override
    public void sit() {
        System.out.println("Clank!");
    }

    public void oilChange() {}
}

class Communicate {
    public static <T extends Performs> void perform(T perform) {
        perform.speak();
        perform.sit();
    }
}


public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog dog = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(dog);
        Communicate.perform(r);
    }
}
