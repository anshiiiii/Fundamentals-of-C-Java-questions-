/*Write a Java program for the following case.

Given a number, find the sum of all the unique multiples of particular numbers up to but not including that number.

If we list all the natural numbers below 20 that are multiples of 3 or 5, we get 3, 5, 6, 9, 10, 12, 15, and 18.

The sum of these multiples is 78.





Input Format:

All inputs corresponds to the Integer value



Output Format:

Output correspond to the multiplied value accordingly (Integer)



Sample Input1:

20

3

5



Sample Output1:

3 5 6 9 10 12 15 18

78*/

package Java_Training.DailyTests;

import java.util.*;
class Main{
  public static void main (String[] args){
      Scanner inp = new Scanner(System.in);
	  int n = inp.nextInt();
	  int a = inp.nextInt();
	  int b = inp.nextInt();
	  if(a <= 0 || b <= 0 || n<=0) System.out.println("Invalid Data");
	  else{
		  List<Integer> li = new ArrayList<>();
		  for(int i = 1;i<n;i++){
			  if(i % a == 0 || i%b==0){
				  if(!li.contains(i)) li.add(i);
			  }
		  }
		  int sum = 0;
		  for(int i : li){
			  sum += i;
			  System.out.printf("%d ",i);
		  }
		  System.out.printf("\n%d",sum);
	    }
        inp.close();
  }
}