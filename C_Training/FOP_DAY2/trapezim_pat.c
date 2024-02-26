/*Write a program to print the trapezium pattern.



Sample Input 1:

4



Sample Output 1:

1*2*3*4*17*18*19*20

--5*6*7*14*15*16

----8*9*12*13

------10*11



Sample Input 2:

2



Sample Output 2:

1*2*5*6

--3*4*/
#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a=1, b=n*n +1;
  for(int i=n;i>=1;i--)
  {
    for(int h=0;h<n-i;h++)
      printf("--");
    for(int j=0;j<i;j++)
      printf("%d*",a++);
    for(int k=0;k<i-1;k++)
      printf("%d*",b++);
    printf("%d",b);
    b=b-2*(i-1);
    printf("\n");
  }
   return 0;
}