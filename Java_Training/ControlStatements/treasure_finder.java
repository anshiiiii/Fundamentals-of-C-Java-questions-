/*Nikitha and Danny are close friends. They both are studying in the same school. Now they are on summer vacation. As they are bored, they ask their parents to take them to an exhibition. Nikitha and Danny play a game. 
In this game, there are three boxes with some number written on top. There is a treasure in one of the three boxes and it is present in the box with the second largest number on top. Also, to open the box, they need to 
decode the correct code of this box. The clue given to them to find the code is that it is the largest number that divides all three given numbers. So, now help Nikitha and Danny to decode the code.



Input Format

Input consists of three integers. The first input corresponds to the number of the first box. The second input corresponds to the number of the second box. The third input corresponds to the number of the third box.



Output Format

Refer to the sample output.



Sample Input 1

2

4

6



Sample Output 1

The treasure is in the box which has the number 4

The code to open the box is 2

*/

package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int l,m,n,i;
    l = s.nextInt();
    m = s.nextInt();
    n = s.nextInt();
    s.close();
    int second = l;
    if(m>=l && m<=n || m<=l && m>=n)
    {
      second = m;
    }
    else if(n>=l && n<=m || n<=l && n>=m)
    {
		second = n;
    }
    
    int lcm = 1;
    for(i=1;i<=l && i<=m && i<=n;i++)
    {
      if(l%i==0 && m%i==0 && n%i==0)
      {
        lcm = i;
      }
    }
    System.out.printf("The treasure is in the box which has the number %d\n",second);
    System.out.printf("The code to open the box is %d",lcm);
  }
}
