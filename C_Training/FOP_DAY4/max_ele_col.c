/*In a family, the people are arranged in rows and columns. Male persons in the families are arranged in a row and females are arranged in a column. Find the eldest woman in each column. Write a program to find the maximum element in each column of the matrix.



Input Format

The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix, and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row-wise order, the first row first, then the second row, and so on.



Output Format

Refer to the sample output for details.



Sample Input

3

2

4 5

6 9

0 3



Sample Output

6

9*/
#include <stdio.h>
int main()
{
  int r,c;
  scanf("%d %d",&r,&c);
  int f[r][c];
  for(int i=0;i<r;i++)
  {
	for(int j=0;j<c;j++)
    {
      scanf("%d",&f[i][j]);
    }
  }
  int max[c];
  for(int i=0;i<c;i++)
  {
    int maxi = -1;
    for(int j=0;j<r;j++)
    {
      if(f[j][i] > maxi)
      {
        maxi = f[j][i];
      }
    }
    max[i] = maxi;
  }
  for(int j=0;j<c;j++)
  {
    printf("%d\n",max[j]);
  }
   return 0;
}