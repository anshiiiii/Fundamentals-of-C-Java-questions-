//This is a program to print original and transpose of a matrix
#include <stdio.h>
int main()
{
  int n,a[100][100];
  scanf("%d",&n);
  for(int i = 0;i < n;i++)
  {
    for(int j = 0;j < n;j++)
    {
       scanf("%d",&a[i][j]);
       printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  printf("Transpose matrix is:\n");
  for(int i = 0;i < n;i++)
  {
    for(int j = 0;j < n;j++)
    {
       printf("%d ",a[j][i]);
    }
    printf("\n");
  }
  
   return 0;
}