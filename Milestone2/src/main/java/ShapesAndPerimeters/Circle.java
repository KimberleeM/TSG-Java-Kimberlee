package ShapesAndPerimeters;

/**
 *
 * @author Max
 */
public class Circle extends Shapes{

    public double radius;
    public double PI = 3.14;

    @Override
    public double getArea() {
        area = PI * radius * radius;
        return area;
        
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * PI *radius;
        return perimeter;
    }
    
    
    
}
