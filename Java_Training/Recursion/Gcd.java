package Java_Training.Recursion;

import java.util.Scanner;

class Main
{
  public int gcd(int a, int b)
  {
    if(b==0)
      return a;
    else
      return gcd(b,a%b);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    Main main = new Main();
    int res = main.gcd(a,b);
    System.out.println(res);
    sc.close();
  }
}