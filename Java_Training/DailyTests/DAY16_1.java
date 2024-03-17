/*Get a number(Integer) from the user and write a java program to check whether the given number is divisible by the sum of the digits of the same number. If the number is divisible, then print "Yes" or if the number is not divisible by the sum of its digits, then print "No".

Input Format:

Input consists of a integer value

Output Format:

Refer sample output for formatting specifications

Sample Input:

200

Sample Output:

Yes*/

package Java_Training.DailyTests;

import java.util.*;
class Main
{
  public static void main(String [] args)
  {
 
	  Scanner inp = new Scanner(System.in);
	  int a = inp.nextInt();
	  int sum = 0;
	  int temp = a;
      inp.close();
	  while(temp>0){
		  sum += temp%10;
		  temp /= 10;
	  }
	  System.out.println(a%sum==0 ? "Yes" : "No");
  }
}
