/*A number can be said as a strong number when the sum of the factorial of the individual digits is equal to the number.

For example, 145 is a strong number. 1! + 4! + 5! = 145. Write a program to check whether a given number is a strong number or not.



Input Format

Input consists of 1 integer.



Output Format

If it is a strong number print "Yes" or print "No"



Sample Input

145



Sample Output

Yes



Explanation 0

= 1! + 4! +5! = 1+24+120 = 145*/
#include <stdio.h>
int main()
{
  int n,temp,r,sum = 0;
  scanf("%d",&n);
  temp = n;
  while(temp != 0)
  {
    int f = 1;
    r = temp % 10;
    for(int i = 1;i <= r;i++)
    {
      f = f*i;
    }
    sum = sum + f;
    temp = temp/10;
  }
  if(sum == n)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
   return 0;
}