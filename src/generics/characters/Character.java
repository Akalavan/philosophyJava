package generics.characters;

public class Character {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
