// Average Of Array;
#include<stdio.h>
int main()
{
    int n,sum=0;
    float avg;
    printf("Enter The Size Of Array :\n");
    scanf("%d", &n);
    int a[n];
    printf("Enter Array Elements :");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
        sum=sum+a[i];
    }
    avg=sum/n;
    printf("Given Array is :\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
    printf("Sum Of the Given Array is :%d", sum );
    printf("\n");
    printf("Average Of the Given Array is :%f", avg);
    return 0;
}