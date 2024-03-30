package Java_Training.DailyTests;

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  System.out.println(n%11);
      sc.close();
  }
}
