/*The first line contains the size of the matrix N. The next N lines contain the elements of the matrix



Output Format

The output prints the rotated matrix



Sample Input 1

3

1 2 3

4 5 6

7 8 9



Sample Output 1

7 4 1

8 5 2

9 6 3*/
#include <stdio.h>
int main()
{
  	int n;
  	scanf("%d",&n);
  	int a[n][n], r[n][n];
  	for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)
        scanf("%d",&a[i][j]);
  	for(int i=0;i<n;i++)
      for(int j=0;j<n;j++)
        r[j][n-1-i]= a[i][j];
  	for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        printf("%d ",r[i][j]);
      }
  	  printf("\n");
    }

}