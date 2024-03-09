/*Input Format:

Input consists of 2 integers. 

The first integer corresponds to n. 

The second integer corresponds to m(rows).



Output Format:

Refer to the sample output for formatting specifications.



Sample Input 1:

5

4



Sample Output 1:

Enter n

Enter m

The multiplication table of 5 is

1*5=5

2*5=10

3*5=15

4*5=20



Explanation:

Multiplication of the 5th table from 1 to 4 is printed.

*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,t;
    n = s.nextInt();
    t = s.nextInt();
    System.out.println("Enter n");
    System.out.println("Enter m");
    System.out.printf("The multiplication table of %d is\n",n);
    for(int i = 1;i <= t;i++)
    {
		System.out.printf("%d*%d=%d\n",i,n,i*n);
    }
    s.close();
    
  }
}
