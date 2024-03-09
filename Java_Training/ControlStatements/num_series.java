/*Write a program to generate the following series 0,2,8,14,...,34.



Input Format

The input is an integer that denotes 'n'.



Output Format

Print the series and refer to the sample output for formatting.



Sample Input 1

10



Sample Output 1

0 2 8 14 24 34 48 62 80 98

*/

package Java_Training.ControlStatements;

import java.util.*;


class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,i,pr;
    n = s.nextInt();
    s.close();
   for(i=1;i<=n;i++)
   {
     if(i%2 == 0)
     {
       pr = (int)Math.pow(i,2) - 2;
       System.out.printf("%d ",pr);
     }
     else
     {
		pr = (int)Math.pow(i,2) - 1;
       System.out.printf("%d ",pr);
     }
   }
  }
}
