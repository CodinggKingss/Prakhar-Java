/*define a class to perform the following operations using the users choice i.e,switch case 
 * 1) print absolute value of a number
 * 2) print rounded value of a fractional number
 * 3) print n raised to the power x
 * 4) quit
 */
 package Java;
import java.util.*;
 class pr11 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int ch;
        System.out.println("SELECT A CHOICE FROM THE MENU");
        System.out.println("Options            key to press ");
        System.out.println("Absolute Value------->1");
        System.out.println("Round up value------->2");
        System.out.println("Power ------------->3");
        System.out.println("\nEnter your choice from above(1,2,3)= ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter a positive or a negative integer :");
            int num = sc.nextInt();
            System.out.println("The absolute value of "+num+"="+Math.abs(num));
            break;
            case 2:
            System.out.println("Enter a Fractional Number :");
            double s = sc.nextDouble();
            System.out.println("The rounded value of "+s+"="+Math.rint(s));
            break;
            case 3:
            System.out.println("Enter a number (as base) :");
            int n=sc.nextInt();
            System.out.println("Enter a number (for exponent) :");
            int x=sc.nextInt();
            System.out.println(n+ "raised to the power" +x+ "=" +Math.pow(n,x));
            break;
            default:
            System.out.println("Wrong choice");
        }

        }
    }
 }