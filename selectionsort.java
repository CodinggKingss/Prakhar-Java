import java.io.*;
import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int n= sc.nextInt();
        int ar[]=new int[n];
        int p,s;
        System.out.println("Enter Array Elements");
        for (int i = 0; i <n ; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        for(int i=0;i<(n-1);i++){
            s=ar[i];
            p=i+1;
            for (int j=i+1;j<n;j++){
                if (ar[j]<s)
                {
                    s=ar[j];
                    p=i;
                }
            }
            int t=ar[i];
            ar[i]=ar[p];
            ar[p]=t;
        }
        System.out.println();
        System.out.println("Sorted Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
