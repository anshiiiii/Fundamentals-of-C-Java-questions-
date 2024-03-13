/*Write a java program to find the prime numbers in given range in the given input.



Input format:

The input consist of two Integers



Output format:

The output consists of Integers



Sample Input:

4

10

Sample Output:

5

7*/


package Java_Training.DailyTests;

import java.util.*;
public class DAY12_1{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
        inp.close();
		for(int i = a;i<=b;i++){
			if(prime(i) && i!=2) System.out.println(i);
		}
	}
	public static boolean prime(int x){
		int c = 0;
		for(int i = 1;i<=x;i++){
			if(x%i==0) c++;
		}
		return c==2;
	}
}