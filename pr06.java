/*wap to accept a number and check whether it is positive or negative
 * even number = n%2=0
 */
package Java;
import java.util.*;
public class pr06 {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
    System.out.println("Enter the number :");
    int a =sc.nextInt();
        if(a>0&&a%2==0)
        System.out.println("Given number is positive :"+ a);
        else
        System.out.println("Number is negative :"+ a);
    }

}
}