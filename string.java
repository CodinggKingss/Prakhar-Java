package Java;

import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String in Capital : ");
            String na = sc.nextLine();
            String na1=na.toLowerCase();
            System.out.println(na1);
            System.out.println("Enter String in Small : ");
            String na2=sc.nextLine();
            String n3=na2.toUpperCase();
            System.out.println(n3);
            System.out.println("Enter Global String ");
            String gs=sc.nextLine();
            int n = gs.length();
            System.out.println("Lenght of the string is : " + n);
        }
}

    
}
