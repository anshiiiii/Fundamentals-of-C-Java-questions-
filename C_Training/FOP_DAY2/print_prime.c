/*A prime number is divisible only by 1 and itself. You are given a positive integer. Write an algorithm to find all the prime numbers from 2 to the given positive number

*/
#include <stdio.h>
int main()
{
  int n;
  scanf("%d", &n);
  for(int i=2;i<=n;i++)
  {
    int count = 0;
    for(int j=2;j<=i;j++)
    {
      if(i%j == 0)
      {
        count++;
      }
    }
    if(count==1)
    {
      printf("%d ",i);
    }
  }
  

   return 0;
}