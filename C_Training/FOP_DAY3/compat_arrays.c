/*Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all the values of i. Write a program to find whether 2 arrays are compatible or not.



Input Format

Input consists of 2n+2 integers. The first integer corresponds to ‘n1’, the size of the first array. The next ‘n1’ integers correspond to the elements in the first array. The next (n+1) integer corresponds to 'n2', the size of the second array. The last 'n2' integers correspond to the elements in the second array.



Output Format

The output is any one of the two strings "Compatible" or "Incompatible"



Sample Input 0

5

2

3

6

8

1

5

1

1

1

1

1



Sample Output 0

Compatible*/
#include <stdio.h>
int main()
{
  int n1,n2,iscomp = 0;
  int a[100],b[100];
  scanf("%d",&n1);
  for(int i = 0;i < n1;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&n2);
  for(int i = 0;i < n2;i++)
  {
    scanf("%d",&b[i]);
  }
  if(n1 == n2)
  {
    for(int i = 0; i < n1;i++)
    {
      if(a[i] >= b[i])
      {
        iscomp = 1;
      }
      else
      {
        iscomp = 0;
        break;
      }
    }
  }
  if(iscomp == 1)
  {
    printf("Compatible");
  }
  else
  {
    printf("Incompatible");
  }
      
   return 0;
}