import java.util.*;

public class java {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Pallindrome Checking");
        System.out.println("Press 2 For Palindrome checking and Printing in the given range ");
        System.out.println("Press 3 for Prime Number Checking in the given range ");
        System.out.println("Press 4 for Pattern Printing");
        System.out.println("Press 5 for The Sum Of Two Matrices");
        System.out.println("Press 6 For Printing The Fabonicci Series");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Press 1 For Only Number Checking :");
                System.out.println("Press 2 For Number/String Checking :");
                int chi = sc.nextInt();
                switch (chi) {
                    case 1:
                        System.out.println("Enter The Number To Be Checked :");
                        int num2 = sc.nextInt();
                        int r2, rev = 0;
                        int temp2 = num2;
                        while (num2 > 0) {
                            r2 = num2 % 10;
                            rev = (rev * 10) + r2;
                            num2 = num2 / 10;
                        }
                        if (temp2 == rev) {
                            System.out.println("The Given Number Is Palindrome!");
                        } else {
                            System.out.println("The Given Number Is Not Palindrome!");
                        }
                        break;
                    case 2:
                        String original, reverse = "";
                        System.out.println("Enter A String(Sentence /number) :");
                        original = sc.next();
                        int length = original.length();
                        for (int i = length - 1; i >= 0; i--) {
                            reverse = reverse + original.charAt(i);
                        }
                        if (original.equals(reverse))
                            System.out.println("Entered String/number is  palindrome ");
                        else
                            System.out.println("Entered String/Number is not palindrome ");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter The Range in which the numbers are to be checked :");
                int N = sc.nextInt();
                int b, rev = 0, c = 0, n;
                System.out.println("Palindrome Numbers In the Given Range are :");
                for (int i = 11; i <= N; i++) {
                    n = i;
                    while (n > 0) {
                        b = n % 10;
                        rev = (rev * 10) + b;
                        n = n / 10;
                    }
                    if (rev == i) {
                        System.out.print(i + " ");
                        c++;
                    }
                    rev = 0;
                }
                System.out.println();
                System.out.println("Frequency of palindrome Numbers In the given range is :" + c);
                break;
            case 3:
                int n1, count = 0, f = 0;
                System.out.println("Enter The Range :");
                n1 = sc.nextInt();
                System.out.println("Prime Numbers Till " + n1 + " are : ");
                for (int i = 1; i <= n1; i++) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0)
                            count++;
                    }
                    if (count == 0 && i != 1) {
                        System.out.print(i + " ");
                        f++;
                    }
                    count = 0;
                }
                System.out.println();
                System.out.println("Frequency Of Prime numbers in the given range is :" + f);
                break;
            case 4:
                System.out.println("Press 1 For A pattern");
                System.out.println("Press 2 For Another Pattern");
                System.out.println("Press 3 for Another Pattern");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter The Range Of the pattern :");
                        int r = sc.nextInt();
                        for (int i = r; i >= 0; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        int n2;
                        int sum = 0;
                        int search1;
                        int count2 = 0;
                        System.out.println("Enter The length of array");
                        n2 = sc.nextInt();
                        int a[] = new int[n2];
                        System.out.println("Enter Array Elemets :");
                        for (int i = 0; i < n2; i++) {
                            a[i] = sc.nextInt();
                            sum = sum + a[i];
                        }
                        System.out.println("Enter The Number which is to be Searched :");
                        search1 = sc.nextInt();
                        for (int i = 0; i < n2; i++) {
                            if (a[i] == search1) {
                                count2++;
                            }
                        }
                        if (count2 > 0)
                            System.out.println("Element Found!");
                        else
                            System.out.println("Element Not Found!");
                        System.out.println("Sum of the given array is :" + sum);
                        for (int i = 0; i < n2; i++) {
                            System.out.print(a[i] + " ");
                        }
                        break;
                    default:
                        System.out.println("Wrong BT");
                }
                break;
            case 5:
                int n4;
                System.out.println("Enter The Range of Matrix: ");
                n4 = sc.nextInt();
                int a1[][] = new int[n4][n4];
                int b1[][] = new int[n4][n4];
                int sum23[][] = new int[n4][n4];
                System.out.println("Enter Elements of Matrix A :");
                for (int i = 0; i < n4; i++) {
                    for (int j = 0; j < n4; j++) {
                        a1[i][j] = sc.nextInt();
                    }
                }
                System.out.println();
                System.out.println("Enter Elements Of Matrix B :");
                for (int i = 0; i < n4; i++) {
                    for (int j = 0; j < n4; j++) {
                        b1[i][j] = sc.nextInt();
                    }
                }
                System.out.println();
                System.out.println("Matrix A is :");
                for (int i = 0; i < n4; i++) {
                    System.out.println();
                    for (int j = 0; j < n4; j++) {
                        System.out.print("\t" + a1[i][j]);
                    }
                }
                System.out.println();
                System.out.println("Matrix B is :");
                for (int i = 0; i < n4; i++) {
                    System.out.println();
                    for (int j = 0; j < n4; j++) {
                        System.out.print("\t" + b1[i][j]);
                    }
                }
                System.out.println();
                for (int i = 0; i < n4; i++) {
                    for (int j = 0; j < n4; j++) {
                        sum23[i][j] = a1[i][j] + b1[i][j];
                    }
                }
                System.out.println();
                System.out.println("Sum Of Matrix A and B is :");
                for (int i = 0; i < n4; i++) {
                    System.out.println();
                    for (int j = 0; j < n4; j++) {
                        System.out.print("\t" + sum23[i][j]);
                    }
                }
                break;
            case 6:
                System.out.println("Enter The value of 'n3' :");
                int n3 = sc.nextInt();
                int first = 0, second = 1;
                int third;
                System.out.println("The Fibonacci series :");
                System.out.print(first + " " + second + " ");
                for (int j = 1; j <= n3; j++) {
                    third = first + second;
                    System.out.print(third + " ");
                    first = second;
                    second = third;
                }
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
