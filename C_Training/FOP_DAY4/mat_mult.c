//Write a program to multiply two matrices of the same dimensions together.
#include <stdio.h>
int main()
{
  int n1,n2,a[100][100],b[100][100],p=1,c[100][100];
  scanf("%d %d",&n1,&n2);
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(int i=0;i<n2;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n1;j++)
    {
      for(int k=0;k<n1;k++)
      {
        c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
      }
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n1;j++)
    {
      printf("%d ",c[i][j]);
    }
    printf("\n");
  }
  
   return 0;
}