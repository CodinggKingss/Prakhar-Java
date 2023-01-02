#include<stdio.h>
int main()
{
  int i,number;
  printf("\n Enter The Value Of No :");
  scanf("%d", &number);
  printf("\n Even Numbers Between 1 and %d are :\n", number);
  for(int i=1;i<number;i++)
  {
    if(i%2==0)
    {
        printf("%d ", i);
    }
  }
  return 0;
}