// convert kilometers to miles
package Java;
import java.util.Scanner;
public class pr04 {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
    
        System.out.println("Enter the value in kilometers :");
     double km=sc.nextDouble();
        double mil=0.62137*km;
        System.out.println("The value in miles is :"+mil);


    }
}
}

