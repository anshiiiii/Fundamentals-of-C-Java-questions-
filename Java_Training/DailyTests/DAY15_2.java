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