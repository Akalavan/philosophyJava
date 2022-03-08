package interfaces;

interface Tossed {
    void toss();
}

interface TossedFactory {
    Tossed getTossed();
}

class Tails implements Tossed {

    @Override
    public void toss() {
        System.out.println("Tails");
    }
}

class TailsFactory implements TossedFactory {

    @Override
    public Tossed getTossed() {
        return new Tails();
    }
}

class Eagle implements Tossed {

    @Override
    public void toss() {
        System.out.println("Eagle");
    }
}

class EagleFactory implements TossedFactory {

    @Override
    public Tossed getTossed() {
        return new Eagle();
    }
}

public class Luck {

    public static void play(TossedFactory ts) {
        Tossed t = ts.getTossed();
        t.toss();
    }

    public static void main(String[] args) {
        play(new EagleFactory());
        play(new TailsFactory());
    }
}
