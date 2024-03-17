/*Get an array of elements with size n from the user input. Write a java program to find all possible difference between two elements in the array. Then print the Larger difference and the two elements whose difference is larger than other elements.

Input Format:

The first line consists of size of array

The next line consists of the elements of array 

Output Format:

Refer sample output for formatting specifications



Sample Input:

5

9

8

5

3

6

Sample Output:

6

Elements with large difference

9

3*/

package Java_Training.DailyTests;

import java.util.*;
class Main
{
  public static void main(String [] args)
  {
      Scanner inp = new Scanner(System.in);
	  int n = inp.nextInt();
	  int[] arr = new int[n];
	  List<Integer> li = new ArrayList<>();
	  for(int i = 0;i<n;i++){
		arr[i] = inp.nextInt();
		  li.add(arr[i]);
	  }
	  Arrays.sort(arr);
	  System.out.println(arr[n-1] - arr[0]);
	  System.out.println("Elements with large difference");
	  if(li.indexOf(arr[n-1])<li.indexOf(arr[0])){
		  System.out.println(arr[n-1]);
		  System.out.println(arr[0]);
	  }else{
		  System.out.println(arr[0]);
		  System.out.println(arr[n-1]);
	  }
      inp.close();
  }
}