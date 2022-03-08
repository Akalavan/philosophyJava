package polymorphism;

import typeinfo.TypeInfo8;

import static util.Print.print;

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }
    Glyph() {
        print("Glyph() before call draw()");
        draw();
        print("Glyph() after call draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangleGlyph extends Glyph {
    private int count = 2;
    RectangleGlyph(int r) {
        count = r;
        print("RectangleGlyph.RoundGlyph(), count = " + count);
    }

    void draw() {
        print("RectangleGlyph.draw(), count = " + count);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangleGlyph(3);
        TypeInfo8.info(RectangleGlyph.class);
    }
}
