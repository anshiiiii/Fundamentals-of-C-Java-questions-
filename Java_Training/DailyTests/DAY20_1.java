/*Write a Java program to check whether the given is number prime or not.

Input format:

The input consist of Integer



Output format:

The output consists of String



Prime/Not prime



Sample Input:

17

Sample Output:

Prime*/

package Java_Training.DailyTests;

import java.util.*;
public class DAY20_1
{
	public static void main(String args[])
{
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int c = 0;
		for(int i = 2;i<a;i++)
		{
			if(a%i==0) c++;
		}
		System.out.println(c==0 ? "Prime" : "Not prime");
        inp.close();
	} 
}