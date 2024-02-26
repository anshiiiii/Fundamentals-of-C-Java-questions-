/*Given an integer matrix of size n*n. n is the number of rows and columns. Traverse it in a spiral form.



Input Format

The first line contains N, which represents the number of rows and columns of a matrix.
The next N lines contain N values, each representing the values of the matrix.


Output Format

A single line containing integers with space represents the desired traversal.



Sample Input 1

3

1 2 3

4 5 6

7 8 9



Sample Output 1

1 2 3 6 9 8 7 4 5

*/
#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  int round = (int)ceil((double)n/2);
  for(int i=0;i<round;i++)
  {
    for(int j=i;j<=n-i-1;j++)  //left to right
      printf("%d ",a[i][j]);
    for(int j=i+1;j<=n-i-1;j++)  //top to bottom
      printf("%d ",a[j][n-i-1]);
    for(int j=n-i-2;j>=i;j--)     //right to nleft
      printf("%d ",a[n-i-1][j]);
     for(int j=n-i-2;j>i;j--)  //bottom to top
      printf("%d ",a[j][i]);
      
  }
      
      
   return 0;
}