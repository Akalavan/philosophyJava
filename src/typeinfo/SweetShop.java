package typeinfo;

import static util.Print.print;

class Candy {
    static { print("Loading class Candy"); }
}

class Gum {
    static { print("Loading class Gum"); }
}

class Cookie {
    static { print("Loading class Cookie"); }
}

public class SweetShop {
    public static void main(String[] args) {
//        print("in main method");
//        Candy c = new Candy();
//        print("After created object Candy");
//
//        try {
//            Class.forName("typeinfo.Gum");
//        } catch (ClassNotFoundException e) {
//            print("Not found Gum");
//        }
//
//        print("After call method Class.forName(\"Gum\")");
//        new Cookie();
//        print("After created object Cookie");
        try {
            Class.forName("typeinfo." + args[0]);
        } catch (ClassNotFoundException e) {
            print("Not found " + args[0]);
        }
    }
}
