import java.util.*;
public class searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("The Given Array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter element to search :");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                f++;
            }
        }
        if (f > 0) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
