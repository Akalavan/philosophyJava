package polymorphism.rodent;

public class Rodents {

    public static void all(Rodent[] r) {

        for (Rodent rodent: r) {
            rodent.eat();
            rodent.sleep();
        }
    }

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for (int i = 0; i < rodents.length; i++) {
            rodents[i] = RandomRodentGenerator.next();
        }
        all(rodents);
    }
}
