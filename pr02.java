//Sum of three numbers 
package Java;
import java.util.Scanner;
public class pr02 
{
public static void main(String[] args) 
{
try(Scanner sc = new Scanner(System.in)){
    System.out.println("Enter 1st number :");
    int a = sc.nextInt();
    System.out.println("Enter 2nd number :");
   int b = sc.nextInt();
    System.out.println("Enter 3rd number :");
    int c = sc.nextInt();
    int sum=a+b+c;
    System.out.println("Sum of three numbers is : " + sum );
}
}    
}
