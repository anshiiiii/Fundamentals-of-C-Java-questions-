/*Write a Java program to find the Arranging Strings in an Alphabetical Order.



Input format:



The input consist of Integer and String



Output format:

The output consists of String



Note: Enter size of array and then enter all the names in that array. Now with the help of compareTo operator we can easily arranging names in Alphabetical Order.



Sample Input:

4

Run

Ate

Bat

Sun



Sample Output:

Ate

Bat

Run

Sun*/

package Java_Training.DailyTests;

import java.util.Scanner;
public class DAY7_2
{
  public static void main(String args[])
  {
    
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  String a[]=new String[n];
	  for(int i=0;i<n;i++){
	     a[i]=s.next();
	  }
	  for(int i=0;i<n;i++){
	    for(int j=0;j<n-1;j++){
		  if(a[j].charAt(0)>a[j+1].charAt(0)){
		    String t=a[j];
			  a[j]=a[j+1];
			  a[j+1]=t;
		  }
		}
	  }
	  for(int i=0;i<n;i++){
	    System.out.println(a[i]);
	  }
      s.close();
  }
}
