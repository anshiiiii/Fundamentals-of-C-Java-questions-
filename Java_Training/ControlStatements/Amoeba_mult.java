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

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int month,first = 0,second = 1,next,sum = 0,i;
    month = s.nextInt();
    s.close();
    if(month == 1)
    {
		System.out.printf("%d",first);
    }
    else if(month == 2)
    {
      System.out.printf("%d",second);
    }
    else
    {
		for(i=3;i<=month;i++)
        {
          next = first+second;
          sum = next;
          first = second;
          second = next;
        }
    }
    System.out.printf("%d",sum);
  }
}
