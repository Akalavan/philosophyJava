package generics;

import util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Item {
    private int id;
    private String description;
    private double price;

    public Item(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static Generator<Item> generator = new Generator<Item>() {
        private Random rand = new Random(47);
        @Override
        public Item next() {
            return new Item(rand.nextInt(1000), "TestItem", Math.round(rand.nextDouble() * 1000) + 0.99);
        }
    };
}

class Container extends ArrayList<Item> {
    public Container(int nItem) {
        Generators.fill(this, Item.generator, nItem);
    }
}

class Vessel extends ArrayList<Container> {
    public Vessel(int nContainer, int nItem) {
        for (int i = 0; i < nContainer; i++) {
            add(new Container(nItem));
        }
    }
}

class SeaPort extends ArrayList<Vessel> {
    public SeaPort(int nVessel, int nContainer, int nItem) {
        for (int i = 0; i < nVessel; i++) {
            add(new Vessel(nContainer, nItem));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vessel v:
             this) {
            for (Container c :
                    v) {
                for (Item i :
                        c) {
                    sb.append(i);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}

public class G19 {

    public static void main(String[] args) {
        new SeaPort(5, 10, 50);
    }
}
