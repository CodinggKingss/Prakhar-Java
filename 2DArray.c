#include<stdio.h>
int main()
{
    int n;
    printf("Enter The Range of Array :");
    scanf("%d", &n);
    int a[n][n];
    int b[n][n];
    int sum[n][n];
     printf("\n");
     printf("Enter Matrix A Elements :\n");
     printf("\n");
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n;j++)
        {   
            printf("Enter Element a%d%d:" ,i+1,j+1);
            scanf("%d", &a[i][j]);
        }
     }
     printf("Enter Matrix B Elements :\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("Enter Element b%d%d:" ,i+1,j+1);
            scanf("%d", &b[i][j]);
        }
    }
    printf("\n");
     printf("Matrix A is : \n");
    for(int i=0;i<n;i++)
    {
        printf("\n");
        for(int j=0;j<n;j++)
        {
          printf("%d\t" ,a[i][j]);
        }
    }
    printf("\n");
    printf("Matrix B is :\n");
    for(int i=0;i<n;i++)
    {
        printf("\n");
        for(int j=0;j<n;j++)
        {
            printf("%d\t" ,b[i][j]);
        }
    }
    printf("\n"); 
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            sum[i][j]=a[i][j]+b[i][j];
        }
    }
    printf("\n");
    printf("The Sum Of Matrix A and B is :\n");
    for(int i=0;i<n;i++)
    {
        printf("\n");
        for(int j=0;j<n;j++)
        {
            printf("%d\t" ,sum[i][j]);
        }
    }
    printf("\n");
    return 0;
}