package Exercise03;

/**
 *
 * @author Max
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SimpleCalculator sc = new SimpleCalculator();

        //while (true) {
        System.out.println("Which operation would you like to use (+,/,-,*)? 1 for +, 2 for /, 3 for -,4 for *, 5 for exit ");//tells user what we want
        int num = scan.nextInt(); //collect number from user

        if (num == 5) {
            System.out.println("Thank you");
            System.exit(0);
        }
        
        else{
            
        
            
        System.out.println("Enter first operand");//tells user what we want
        float op1 = scan.nextFloat(); //collect number from user
        System.out.println("Enter second operand ");//tells user what we want
        float op2 = scan.nextFloat(); //collect number from user

        if (num == 1) {
            System.out.println(sc.add(op1, op2));
        }

        if (num == 2) {
            System.out.println(sc.divide(op1, op2));
        }
        if (num == 3) {
            System.out.println(sc.subtract(op1, op2));
        }
        if (num == 4) {
            System.out.println(sc.multiply(op1, op2));
        }
        
        }
    
    }

}
