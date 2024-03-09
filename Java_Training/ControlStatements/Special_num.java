/*Professor Kishore wanted the kids to learn about Special numbers. (A two-digit number is said to be a special number if the sum of sum of its digits and the product of its digits is equal to the number itself. For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9. 10+9 = 19.)

Can you help Kishore to write a program to find all special numbers between 2 limits m and n (both inclusive)? Assume that m and n are two-digit numbers.



Input Format

Input consists of 2 integers m and n.



Output Format

Refer to the sample output for the output format.



Sample Input 1

11

19



Sample Output 1

19

*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int m,n,f,l,i,temp;
    m = s.nextInt();
    n = s.nextInt();
    s.close();
    for (i=m;i<=n;i++)
    {
		temp = i;
        l = temp%10;
        f = temp/10;
        if((l+f) + (l*f) == i)
        {
			System.out.printf("%d\n",i);
        }
    }
    
  }
}
