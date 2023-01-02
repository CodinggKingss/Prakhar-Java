#include<stdio.h>
int main()
{
    int n;
    int f=0;
    printf("Enter Size of array :\n");
    scanf("%d", &n);
    int a[n];
    printf("Enter Array Elements :\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\n");
    printf("Given Array is :\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
    int s;
    printf("Enter The Number To be Searched :\n");
    scanf("%d ", &s);
    for (int i = 0; i < n; i++)
    {
        if(s==a[i])
        printf("Found!");
        break;     
    }
    return 0;
    
    
}