package containers;

import util.CollectionData;
import util.RandomGenerator;

import java.util.ArrayList;

public class CollectionDataGenerator {

    public static void main(String[] args) {
        System.out.println(new ArrayList<>(CollectionData.list(new RandomGenerator.String(9), 10)));
        System.out.println(new ArrayList<>(CollectionData.list(new RandomGenerator.Integer(), 10)));
    }
}
