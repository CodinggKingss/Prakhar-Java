//to find the avaerage of n numbers using array
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg=0.0;
        int sum=0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.println("The Given array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The Sum of Array is :"+ sum);
        avg=sum/n;
        System.out.println("Average is :"+ avg);
    }
}
