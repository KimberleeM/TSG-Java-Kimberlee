package ShapesAndPerimeters;

/**
 *
 * @author Max
 */
public abstract class Shapes {

    public String color;
    public double area;
    public double perimeter;

    public abstract double getArea();

    public abstract double getPerimeter();

    public static void main(String[] args) {

        Shapes square = new Square();
        square.getArea();
        square.getPerimeter();
        Shapes triangle = new Triangle();
        triangle.getArea();
        triangle.getPerimeter();
        Shapes rectangle = new Rectangle();
        rectangle.getArea();
        rectangle.getPerimeter();
        Shapes circle = new Circle();
        circle.getArea();
        circle.getPerimeter();

    }
}
