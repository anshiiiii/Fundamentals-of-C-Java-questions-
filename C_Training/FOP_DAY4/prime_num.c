/*Write a program to find whether the given number is a prime number or not using recursion.

*/
#include <stdio.h>
int prime(int a,int i)
{
  if(i == 1)
  {
    return 1;
  }
  else
  {
    if(a%i == 0 )
    {
      return 0;
    }
    else
    {
      return prime(a,i-1);
    }
  }
}
int main()
{
  int n;
  scanf("%d",&n);
  if(n<2)
  {
    printf("Not a Prime Number");
  }
  else
  {
    if(prime(n,n/2))
    {
      printf("Prime Number");
    }
    else
    {
	  printf("Not a Prime Number");
    }
  }
  
   return 0;
}