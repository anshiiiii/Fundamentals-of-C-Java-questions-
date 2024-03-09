/*Sample Input 1

5



Sample Output 1

*****

*   *

*   *

*   *

*****

*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i,j;
    for(i=1;i<=n;i++)
    {
		for(j=1;j<=n;j++)
        {
          if(i==1 || i==n || j==1 || j==n)
          {
            System.out.printf("*");
          }
          else
          {
			System.out.printf(" ");
          }
        }
      System.out.printf("\n");
    }
  }
}
