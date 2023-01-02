package Java;
import java.util.*;
 class cricle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The radius of the Circle :");
              int r = sc.nextInt();
              double area=0.0;
              double perimeter = 0.0;
              area = 3.14*(r*r);
              perimeter = 2*3.14*r;
              System.out.println("Area of the circle is : " + area);
              System.out.println("Perimeter of the Circle is : " + perimeter);
        }
    }
}
