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

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,temp,r,sum=0,i;
    n = s.nextInt();
    s.close();
    temp = n;
    while(temp != 0)
    {
      int f = 1;
      r = temp%10;
      for(i=1;i<=r;i++)
      {
        f = f*i;
      }
      sum = sum+f;
      temp = temp/10;
    }
    if(sum == n)
    {
		System.out.println("Yes");
    }
    else
    {
		System.out.println("No");
    }
  }
}
