package Exercise03;

/**
 *
 * @author Max
 */
public class SimpleCalculator {
    public void run(){
    }  
    int operands1;
    float operands2;
 
    
    public void operands1(int operands1){
        this.operands1 = operands1;
        
    }
   

    public int getOperands1() {
        return operands1;
    }

    public void setOperands1(int operands1) {
        this.operands1 = operands1;
    }

    public float getOperands2() {
        return operands2;
    }

    public void setOperands2(float operands2) {
        this.operands2 = operands2;
    }
    
    public float add(){
        return operands1 + operands2;
    }
    
    public float multiply(){
        return operands1 * operands2;
    }
    
    public float divide(){
        return operands1 / operands2;
    }
    
    public float subtract(){
        return operands1 - operands2;
    }

 
}  

