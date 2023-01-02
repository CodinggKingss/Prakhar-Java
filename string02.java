package Java;
import java.util.*;
public class string02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter String in Upper Case");
            String na = sc.nextLine();
            String na1=na.toLowerCase();
            System.out.println(na1);
        }
    }
}
