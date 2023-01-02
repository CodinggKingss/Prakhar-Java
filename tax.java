package Java;
import java.util.*;
public class tax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Salary :");
            int sal = sc.nextInt();
            double tax = 0.0;
            if(sal<=100000)
            {
                tax=0;
            }
            if(sal>100000)
            {
                tax= 0.10*sal;
            }
            System.out.println("Total tax is : " + tax);
        }
    }   
}
