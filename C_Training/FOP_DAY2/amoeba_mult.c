/*The Research team led by Bernadette Wolowitz at Cal-tech University has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting this amoeba at a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index is given, write a program to display the amoeba’s size.

For Example, the size of the amoeba in months 1, 2, 3, 4, 5, 6,... will be 0, 1, 1, 2, 3, 5, 8.... respectively.



Input Format

The input is an integer that denotes the count of the month.



Output Format

The output is an integer denoting the amoeba size.



Sample Input 1

13



Sample Output 1

144*/
#include <stdio.h>
int main()
{
  int month,first=0,second=1,next,sum=0,t=0;
  scanf("%d",&month);
  if(month == 1)
  {
    printf("%d",first);
  }
  else if(month == 2)
  {
    printf("%d",second);
  }
  else
  {
  for(int i=3;i<=month;i++)
  {
    next = first+second;
    sum = next;
    first = second;
    second = next;   
  }
  }
  printf("%d",sum);
   return 0;
}