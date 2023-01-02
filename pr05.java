/*wap to accept name of employee ,basic salary,and calculate gross salary of employee as per rule:-
HRA = 25% of basic salary
DA = 92% of basic salary
PF = 15% of basic salary
Gross salary = Basic + HRA+DA+PF
 */
package Java;
import java.util.*;
public class pr05 {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        double hra=0.0;
        double da=0.0;
        double pf=0.0;
        double gross=0.0;
        String na;
        int bs;
        System.out.println("Enter name of employee :");
        na=sc.nextLine();
        System.out.println("Enter basic salary of employee:");
        bs=sc.nextInt();
        hra=0.25*bs;
        da=0.92*bs;
        pf=0.15*bs;
        gross=bs+hra+da+pf;
        System.out.println("Name of employee:" + na);
        System.out.println("Basic salary :"+ bs);
        System.out.println("House rent :"+ hra);
        System.out.println("Daily Allowance :"+ da);
        System.out.println("Provident fund :"+ pf);
        System.out.println("Gross salary :"+ gross);
       }
    }
}
