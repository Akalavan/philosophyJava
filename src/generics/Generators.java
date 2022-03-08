package generics;

import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import util.Generator;

import java.util.*;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<>(), new CoffeeGenerator(), 4);
        for (Coffee c :
                coffee) {
            System.out.println(c);
        }

        Collection<Integer> fNumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i :
                fNumbers) {
            System.out.print(i + ", ");
        }

        Collection<Integer> hset = fill(new HashSet<>(), new Fibonacci(), 12);
        for (int i :
                hset) {
            System.out.print(i + ", ");
        }

        Collection<Integer> llist = fill(new LinkedList<>(), new Fibonacci(), 12);
        for (int i :
                llist) {
            System.out.print(i + ", ");
        }
    }
}
