/*A prime number is divisible only by 1 and itself. You are given a positive integer. Write an algorithm to find all the prime numbers from 2 to the given positive number

*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    int i,j;
    for(i=2;i<=n;i++)
    {
      int count = 0;
      for(j=2;j<=i;j++)
      {
		if(i%j == 0)
        {
			count++;
        }
      }
      if(count == 1)
      {
        System.out.printf("%d ",i);
      }
    }
    
  }
}