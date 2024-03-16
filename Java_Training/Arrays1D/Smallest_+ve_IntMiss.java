package Java_Training.Arrays1D;

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
    int missing = 1;
    for(int i=0;i<n;i++)
    {
      if(a[i] <=0)
        continue;
      if(a[i] == missing)
        missing++;
      else if(a[i] > missing)
        break;
    }
    System.out.println(missing);
    sc.close();
  }
}
