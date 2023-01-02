/*wap to accept three numbers and find out largest number */
package Java;
import java.util.*;
public class pr07 {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        int a,b,c;
        System.out.println("Enter first number :");
        a=sc.nextInt();
        System.out.println("Enter Second number :");
        b=sc.nextInt();
        System.out.println("Enter third number :");
        c=sc.nextInt();
        if(a>b)
        if(a>c)
        System.out.println("A is the largest number :"+ a);
        else
        System.out.println("C is the largest :"+ c);
        else
        if(b>c)
        System.out.println("B is the largest :"+ b);
        else 
        System.out.println("C is the largest:"+ c);
}
    }
}