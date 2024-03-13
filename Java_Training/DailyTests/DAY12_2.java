/*Write a java program to find the GCD of two number in the given numbers.



Input format:

The input consist of two Integers



Output format:

The output consists of Integer



Sample Input:

5

10

Sample Output:

5*/

package Java_Training.DailyTests;

import java.util.*;
public class DAY12_2{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
        inp.close();
		int max = Math.max(a,b);
		int gcd = 1;
		for(int i = 1;i<=max;i++){
			if(a%i == 0 && b%i == 0){
				gcd = Math.max(i,gcd);
			}
		}
		System.out.println(gcd);
	}
}