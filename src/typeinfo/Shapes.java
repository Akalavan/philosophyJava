package typeinfo;
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

  @Override
  public String toString() {
    return "Rhomboid " + select;
  }

}

public class Shapes {

  public static void rotate(Shape shape) {
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
    info(c.getSuperclass());
  }

  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle(), new Rhomboid(), new Triangle(), new Circle(), new Square(), new Rhomboid()
    );
//    for(Shape shape : shapeList)
//      shape.draw();
//
//    for(Shape shape : shapeList)
//      if (!(shape instanceof Circle)) {
//        rotate(shape);
//      }

    try {
      select(shapeList, Class.forName("typeinfo.Triangle"));
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    for(Shape shape : shapeList)
      shape.draw();

    TypeInfo8.info(new Rhomboid().getClass());
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
