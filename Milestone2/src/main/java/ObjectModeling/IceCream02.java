package ObjectModeling;

/**
 *
 * @author Max
 */
public class IceCream02 {
      
    private String flavor;
    private int ounces;
    private int price;
    private int amountofbuckets;
    
    public IceCream02(int price, int amountofbuckets){
        this.price = price;
        this.amountofbuckets = amountofbuckets;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }



 
    

    
    
}
