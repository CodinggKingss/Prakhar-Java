package Java;
import java.util.*;
public class pr14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The age :");
            int age = sc.nextInt();
            if(age>=16&&age<18)
      System.out.println("The Person is eligible to apply for the learners license and is permitted to drive gearless vechicle  ");
      if(age>=18)    
            System.out.println("The person is eligible to apply for a permanent drivers license and is permitted to drive the only vehicles permitted by the same");
            else
            System.out.println("Not eligilbe to drive ");
        }           
    }
}
