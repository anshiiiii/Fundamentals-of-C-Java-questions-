package Java_Training.ControlStatements;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(),i,j;
    for(i=n;i>0;i--)
    {
      for(j=0;j<i;j++)
        System.out.printf("*");
      System.out.printf("\n");
    }
  }
}
