package generics;

//public class Cat extends ComparablePet implements Comparable<Cat> {
//}
public class Cat extends ComparablePet implements Comparable<ComparablePet> {

    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

class Gecko extends ComparablePet {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}