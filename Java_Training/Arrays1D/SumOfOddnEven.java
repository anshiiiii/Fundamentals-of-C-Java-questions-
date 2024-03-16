package Java_Training.Arrays1D;



import java.util.Scanner;
public class SumOfOddnEven 
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
    }
    int esum = 0, osum = 0;
    for(int j=0;j<n;j++)
    {
        if(arr[j]%2==0)
        {
            esum += arr[j];
        }
        else
        {
            osum += arr[j];
        }
    }
        System.out.println("Sum of Even numbers: "+esum);
        System.out.println("Sum of Odd numbers: "+osum);
        sc.close();
    }
}
