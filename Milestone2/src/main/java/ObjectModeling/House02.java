package ObjectModeling;

/**
 *
 * @author Max
 */
public class House02 {
    
    private String location;
    private int squareFt;
    private int length;
    private int height;
    
    public House02(int length, int height){
        this.length = length;
        this.height = height;
    }
    
    public void setlocation(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public int getSquareFt() {
        return squareFt;
    }

    public void setSquareFt(int squareFt) {
        this.squareFt = squareFt;
    }
    
    
    
}
