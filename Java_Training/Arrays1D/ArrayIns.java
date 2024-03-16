package Java_Training.Arrays1D;

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
      int pos = sc.nextInt();
      if(pos<=n)
      {
        int ele = sc.nextInt();
        for(int i = n-1;i>pos-1;i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = ele;
        System.out.println("Array after insertion is:");
        for(int i = 0;i<n+1;i++)
        {
            System.out.println(arr[i]);
        }
      }
        else
        {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}



