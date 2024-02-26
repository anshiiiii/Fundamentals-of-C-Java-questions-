/*Ravi is not able to figure out the method to calculate the sum of the Zig-Zag pattern in the Matrix. Can you help Ravi to write a program to find the sum of Zig-Zag patterns in a given matrix?



Input Format

Input consists of 2 integers and 1 2D array.
Integers corresponding to the size of rows and columns.


Output Format

The output prints the sum of the zig-zag pattern.
Refer to the sample output.
Note: Size of row and column should be same


Sample Input

3

3

1 2 3

4 5 6

7 8 9



Sample Output

Sum of Zig-Zag pattern is 35



Explanation

The sum of zig-zag pattern is 1+2+3+5+7+8+9=35 and hence its prints 35*/
#include <stdio.h>
int main()
{
  int n1,n2,a[100][100],sum=0;
  scanf("%d %d",&n1,&n2);
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
   for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      if(i==0 || i==n1-1 || j==n2-1-i)
      {
        sum = sum + a[i][j];
      }
    }
  }
  printf("Sum of Zig-Zag pattern is %d",sum);
   
   return 0;
}