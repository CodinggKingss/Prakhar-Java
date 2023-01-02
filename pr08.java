/*wap to calculate :-
 * 1) area of circle 
 * 2) area of square
 * 3) circumference of circle
 * 4) perimeter of square
  */
package Java;
import java.util.*;
public class pr08 {
     public static void main(String[] args) {
        double res=0.0;
        double v=0.0;
        int ch;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Press 1 for Area of Circle ");
            System.out.println("Press 2 for Area of Square");
            System.out.println("Press 3 for circumference of circle");
            System.out.println("Press 4 for Perimeter of Square");
            ch=sc.nextInt();
            System.out.println("Enter value :");
            v=sc.nextDouble();
            switch(ch)
            {
                case 1:
                res=3.14*v*v;
                System.out.println("Area of Circle :" +res);
                break;
                case 3:
                res=2*3.14*v;
                System.out.println("Circumference of circle is :"+res);
                break;
                case 4:
                res=4*v;
                System.out.println("Perimeter of square is :"+ res);
                break;
                case 2:
                res=v*v;
                System.out.println("Area of square is :"+ res);
                break;
                default :
                System.out.println("Wrong choice ");
            }
        }
    }
}
            
        
    
