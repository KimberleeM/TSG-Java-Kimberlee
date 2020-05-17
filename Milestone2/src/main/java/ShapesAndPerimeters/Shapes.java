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
       
        Shapes shp = new Square();
        shp.getArea();
        shp.getPerimeter();
    }
}
