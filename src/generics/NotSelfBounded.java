package generics;

import javax.print.DocFlavor;

public class NotSelfBounded<T> {
    T element;
    NotSelfBounded<T> set(T arg) {
        element = arg;
        return this;
    }
    T getElement() {
        return element;
    }
}

class A2 extends NotSelfBounded<A2> {}
class B2 extends NotSelfBounded<A2> {}

class C2 extends NotSelfBounded<C2> {
    C2 setAndGet(C2 arg) {
        set(arg);
        return getElement();
    }
}

class D2 {}
class E2 extends NotSelfBounded<D2> {}