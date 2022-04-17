package generics.characters;

import util.Generator;

import java.util.Iterator;
import java.util.Random;

public class CharacterGenerator implements Generator<Character>, Iterable<Character> {

    private Class[] types = {BadGuys.class, GoodGuys.class};
    private Random rand = new Random(47);

    private int size = 0;

    public CharacterGenerator() {
    }

    public CharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public Character next() {
        try {
            return (Character) types[rand.nextInt(types.length)].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<Character> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Character next() {
            count--;
            return CharacterGenerator.this.next();
        }
    }

    @Override
    public Iterator<Character> iterator() {
        return new CharacterIterator();
    }

    public static void main(String[] args) {
        CharacterGenerator cg = new CharacterGenerator();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(cg.next() + " ");
//        }

        for (Character c :
                new CharacterGenerator(5)) {
            System.out.println(c);
        }
    }
}
