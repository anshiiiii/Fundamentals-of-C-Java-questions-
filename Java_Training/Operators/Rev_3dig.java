package Java_Training.Operators;

/*Write a program to reverse a 3-digit number.*/

import java.util.*;

public class Rev_3dig
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,last,first,mid1,midf,con;
    n = s.nextInt();
    first = n/100;
    last = n%10;
    mid1 = n/10;
    midf = mid1%10;
    con = (last*100) + (midf*10) + (first*1);
    System.out.printf("%d",con);
    s.close();
  }
}
