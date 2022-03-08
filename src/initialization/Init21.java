package initialization;

import object.HelloDate;

public class Init21 {
    public static void main(String[] args) {
        for (Money m :
                Money.values()) {
            System.out.println(m + " ordinal " + m.ordinal());
            switch (m) {
                case EUR:
                    System.out.println("This is EUR");
                    break;
                case RUB:
                    System.out.println("This is RUB");
                    break;
                case USD:
                    System.out.println("This is USD");
                    break;
            }
        }
        new HelloDate();

    }
}
