package typeinfo;

import util.Null;

public class Person {
    public final String first;
    public final String last;
    public final String adress;

    public Person(String first, String last, String adress) {
        this.first = first;
        this.last = last;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null {

        private NullPerson() {
            super("None", "None" , "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }

    public static final Person NULL = new NullPerson();
}
