package ShapesAndPerimeters;

/**
 *
 * @author Max
 */
public class Rectangle extends Shapes {

    public int w;
    public int l;

    @Override
    public double getArea() {
        area = w * l;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (l + w);
        return perimeter;

    }

}
