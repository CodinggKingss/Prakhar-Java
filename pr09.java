/*convert given temp from fahrenheit to celsius and vice versa  */
package Java;
import java.util.*;
public class pr09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            double f=0.0;
            double c=0.0;
            System.out.println("Press 1 for F to C ");
            System.out.println("Press 2 for C to F ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter Temperature in F");
                f=sc.nextDouble();
                c=5/9*(f-32);
                System.out.println("Temperature in F :"+ f);
                System.out.println("Temperature in C :"+c);
                break;
                case 2:
                System.out.println("Enter Temperature in C ");
                c=sc.nextDouble();
                f=1.8*(c+32);
                System.out.println("Temp in C :"+ c);
                System.out.println("Temp in F : "+f);
                break;
                default:
                System.out.println("Wrong choice ");
            }
        }
    }
}

        

        
    

