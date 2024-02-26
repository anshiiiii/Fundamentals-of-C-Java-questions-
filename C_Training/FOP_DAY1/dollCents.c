/*Kamal was traveling from Korea to USA and he was not aware of the currency system of USA. Can you please help him to add two dollars and cents?

Note: 1 dollar=100 cents



Input Format

Input consists of 4 integers. The first two inputs correspond to the value of the first dollar and cent. The next two inputs correspond to the value of the second dollar and cent.



Output Format

The output should print the sum of dollars and cents.



Sample Input

30

10

140

99



Sample Input

171

9*/
#include <stdio.h>
int main()
{
  int d1,c1,d2,c2,td,tc;
  scanf("%d %d %d %d",&d1,&c1,&d2,&c2);
  td = (d1 + d2) + (c1+c2)/100;
  tc = (c1+c2)%100;
  printf("%d\n",td);
  printf("%d",tc);
   return 0;
}