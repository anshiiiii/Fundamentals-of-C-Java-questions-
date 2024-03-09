/*Write a program to find the sum of digits of a number until the sum becomes a single digit.



Input Format

Input format consists of a number



Output Format

Output format consists of an integer

Input (stdin)
78945623

Output (stdout)
8*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(),sum = 0;
    s.close();
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
    System.out.println(sum);
  }
}
