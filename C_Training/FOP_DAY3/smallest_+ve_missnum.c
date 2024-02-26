/*You are given an array a[ ] of n integers. The task is to find the smallest positive number missing from the array.



Input Format

First line - n, the size of an array Second line - all the n elements (a[i] can be positive, negative, zero)



Output Format

Print the smallest positive number missing from the array.



Sample Input

6

4 2 0 -1 1 -3



Sample Output

3

*/
#include <stdio.h>
int main()
{
  int n,a[100];
  scanf("%d",&n);
  for(int i = 0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n-1;i++)
  {
    for(int j=0;j<n-i-1;j++)
    {
      if(a[j] > a[j+1])
      {
        int temp = a[j];
        a[j] = a[j+1];
        a[j+1] = temp;
      }
    }
  }
  int missing = 1;
  for(int i =0;i<n;i++)
  {
    if(a[i] <=0)
      continue;
    if(a[i] == missing)
    {
      missing++;
    }
    else if(a[i] > missing)
    {
      break;
    }
  }
  printf("%d",missing);
   return 0;
}