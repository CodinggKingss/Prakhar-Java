import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array :");
        int size = sc.nextInt();
        int a[][] = new int[size][size];
        int b[][]=new int[size][size];
        int c[][]=new int[size][size];
        System.out.println("Enter Matrix A  Elements :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter Element a" + (i + 1) + (j + 1));
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter Matrix B Elements :");
        for (int i = 0; i <size ; i++) {
            for (int j=0;j<size;j++)
            {
                System.out.println("Enter Element b"+(i+1)+(j+1));
                b[i][j]= sc.nextInt();
            }
        }
            System.out.println("Matrix A is :");
            for (int i = 0; i < size; i++) {
                System.out.println("\t");
                for (int j = 0; j < size; j++) {
                    System.out.print(a[i][j] + " ");
                }}
        System.out.println();
                System.out.println("Matrix B is :");
                for (int i = 0; i<size ; i++) {
                    System.out.println("\t");
                    for(int j=0;j<size;j++)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                }
        for (int i = 0; i <size ; i++) {
            for (int j=0;j<size;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println();
        System.out.println("Sum of Matrix A and B is:");
        for (int i = 0; i <size ; i++) {
            System.out.println("\t");
            for(int j=0;j<size;j++)
            {
                System.out.print(c[i][j]+" ");
            }
        }
            }
        }
