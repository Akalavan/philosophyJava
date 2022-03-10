package typeinfo;
import java.lang.reflect.Field;
import java.util.*;

abstract class Shape {
  public boolean select = false;
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle extends Shape {

  public String toString() { return "Circle "  + select; }

}

class Square extends Shape {


  public String toString() { return "Square "  + select; }

}

class Triangle extends Shape {

  public String toString() { return "Triangle "  + select; }

}

class Rhomboid extends Shape {
  int i;
  String s;
  char[] c;

  @Override
  public String toString() {
    return "Rhomboid " + select;
  }

}

public class Shapes {

  public static void rotate(Shape shape) {
    if (!(shape instanceof Circle))
      System.out.println(shape + ".rotate");
  }

  public static void select(List<Shape> shapes, Class c) {
    for (Shape shape: shapes) {
      if (shape.getClass().equals(c))
        shape.select = true;
    }
  }

  public static void info(Class c) {
    if (c == null) return;
    System.out.println(c.getSimpleName());

    for (Field field :
            c.getDeclaredFields()) {
      System.out.print(field + ", ");
    }
    System.out.println();

    info(c.getSuperclass());
  }

  public static void main(String[] args) {
    Shape s = new Rhomboid();
    if ( s instanceof Circle) {
      Circle r = (Circle) s;
    }


    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid(), new Triangle(), new Circle(), new Square(), new Rhomboid()
    );


    for(Shape shape : shapeList)
      if (!(shape instanceof Circle)) {
        rotate(shape);
      }

    try {
      select(shapeList, Class.forName("typeinfo.Triangle"));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    select(shapeList, Rhomboid.class);

    for(Shape shape : shapeList)
      shape.draw();

    info(Rhomboid.class);

    try {
      Class.forName("java.lang.String");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
