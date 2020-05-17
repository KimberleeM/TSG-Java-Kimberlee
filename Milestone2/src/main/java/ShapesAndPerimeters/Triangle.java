package ShapesAndPerimeters;

/**
 *
 * @author Max
 */
public class Triangle extends Shapes {
    
    public int height;
    public int base;
    public int side1;
    public int side2;

    @Override
    public double getArea() {
        area = height * base/2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side1 + base + side2;
        return perimeter;
    }
    

}
