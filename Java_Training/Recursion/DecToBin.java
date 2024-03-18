package Java_Training.Recursion;

import java.util.Scanner;

class Main
{
  public void decToBin(int a)
  {
    if(a==0){
      return;
    }
    decToBin(a/2);
    System.out.print(a%2);
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Main main = new Main();
    main.decToBin(n);
    sc.close();
    
  }
}