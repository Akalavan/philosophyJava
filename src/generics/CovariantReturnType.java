package generics;

class Base {}

class Derived extends Base {}

interface OrdinaryGetter {
    Base get();
}

interface DerivedGetter extends OrdinaryGetter {
    Derived get();
}

public class CovariantReturnType {
    void test(DerivedGetter d) {
        Derived d2 = d.get();
    }
}
