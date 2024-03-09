/*Write a program to print the trapezium pattern.



Sample Input 1:

4



Sample Output 1:

1*2*3*4*17*18*19*20

--5*6*7*14*15*16

----8*9*12*13

------10*11



Sample Input 2:

2



Sample Output 2:

1*2*5*6

--3*4*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a=1,b=n*n +1,i,j,k,h;
    for(i=n;i>=1;i--)
    {
      for(h=0;h<n-i;h++)
        System.out.printf("--");
      for(j=0;j<i;j++)
        System.out.printf("%d*",a++);
      for(k=0;k<i-1;k++)
        System.out.printf("%d*",b++);
      System.out.printf("%d",b);
      b = b-2 * (i-1);
      System.out.printf("\n");
    }
  }
}
