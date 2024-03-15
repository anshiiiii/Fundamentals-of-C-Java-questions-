/*Here comes a riddle!... Your friend says, "The lions in Mangroove forest keep breeding uncontrollably so it's difficult to track their age. I can tell how old an entire family is but not individual age. Two lion cubs are of the same age. Their father is X years older than them. The combined age of the three is Y. Calculate their individual ages." Write a java program to find the solution for this riddle.

Input Format:

First input corresponds to the father's age older than cubs age (Integer)

Second input corresponds to the combined age of father lion and it's cubs (Integer)



Output Format:

Output corresponds to the individual of them



Sample Input:

10

40



Sample Output:

Father lion's age is 20

Cub's age is 10*/

package Java_Training.DailyTests;

import java.util.*;
public class DAY14_2{
  public static void main(String[] args){
    //Type your code here
	  Scanner inp = new Scanner(System.in);
	  int a = inp.nextInt();
	  int b = inp.nextInt();
      inp.close();
	  int cubs = (b-a)/3;
	  int papa = ((2*a)+b)/3;
	  System.out.printf("Father lion's age is %d\n",papa);
	  System.out.printf("Cub's age is %d",cubs);
  }
}
