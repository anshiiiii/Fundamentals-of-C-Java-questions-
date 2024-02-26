/*Write a program to find the sum of digits of a number until the sum becomes a single digit.



Input Format

Input format consists of a number



Output Format

Output format consists of an integer

Input (stdin)
78945623

Output (stdout)
8*/
#include <stdio.h>
int main()
{
  int n,sum = 0;
  scanf("%d",&n);
  while(n>0)
  {
    sum = sum + n%10;
    n = n/10;
    if(n == 0 && sum>9)
    {
      n = sum;
      sum = 0;
    }
  }
  printf("%d",sum);
   return 0;
}