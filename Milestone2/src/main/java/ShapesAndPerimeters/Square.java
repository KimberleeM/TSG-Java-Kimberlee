package ShapesAndPerimeters;

/**
 *
 * @author Max
 */
public class Square extends Shapes {

    public int a;

    @Override
    public double getArea() {
        area = a * a;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * a;
        return perimeter;
    }

}
