package generics;

import util.Generator;

import java.util.*;

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;
    private LittleFish() {

    }

    @Override
    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator() {
        return LittleFish::new;
    }
}

class BigFish {
    private static long counter = 1;
    private final long id = counter++;
    private BigFish() {}

    @Override
    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator() {
        return BigFish::new;
    }
}

public class G18 {
    public static void eating(BigFish b, LittleFish l) {
        System.out.println(b + " eating " + l);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<LittleFish> littleFish = new LinkedList<>();
        Generators.fill(littleFish, LittleFish.generator(), 15);
        List<BigFish> bigFish = new ArrayList<>();
        Generators.fill(bigFish, BigFish.generator(), 5);
        for (LittleFish lf :
                littleFish) {
            eating(bigFish.get(rand.nextInt(bigFish.size())), lf);
        }
    }
}
