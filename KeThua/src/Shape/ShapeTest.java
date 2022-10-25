package Shape;

import Shape.Model.Circle;
import Shape.Model.Rectangle;
import Shape.Model.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);


        Circle circle = new Circle();
        System.out.println(circle);


        circle = new Circle("black",true,3.6);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("red",false,1.3,1.4);
        System.out.println(rectangle);
    }
}