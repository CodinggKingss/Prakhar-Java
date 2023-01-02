// 

package Java;
import java.util.*;
public class practice01{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Marks in Physics :");
            int phy= sc.nextInt();
            System.out.println("Enter Marks in Mathematics :");
            int maths= sc.nextInt();
            System.out.println("Enter Marks in Chemistry :");
            int chem = sc.nextInt();
            System.out.println("Enter Marks in Biology :");
            int bio = sc.nextInt();
            double total =0.0; double average =0.0;
            total = phy+bio+maths+chem;
            average=(total/400)*100;
            System.out.println("Your Marks in Physics is is: "+ phy);
            System.out.println("Your Marks in Chemistry is: "+ chem);
            System.out.println("Your Marks in Biology is:"+ bio);
            System.out.println("Your Marks in Mathematics is :"+maths);
            System.out.println("Your Total Marks : " + total); 
            System.out.println("Your Total Percentage is :"+average);         
            if(total>(0.40*400)&&phy>33&&maths>33&&bio>33&&chem>33)
            System.out.println("Congrats You are Passed in The Examination ! ");
            else
            System.out.println("Better Luck Next Time ! :)");
        }



        }
     } 















