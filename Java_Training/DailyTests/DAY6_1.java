/*Write a Java program to check if batches of size 3 are summing up to the same value.



Input format :

Input format consist of an Integer.

Output format :

Output format consist of an Integer.



Sample Input 1 :

n = 6

list[] = {1, 2, 3, 5, 0, 1}

Sample Output 1 :

Perfect Batch



Sample Input 2 :

n = 6

list[] = {1, 1, 2, 2, 3, 3}

Sample Output 2 :

Not a Perfect Batch*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY6_1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] list = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            list[i] = scanner.nextInt();
        }
        
        boolean isPerfectBatch = true;
        int sum = list[0] + list[1] + list[2];
        for (int i = 3; i < n; i += 3)
        {
            int currentSum = list[i] + list[i + 1] + list[i + 2];
            if (currentSum != sum) 
            {
                isPerfectBatch = false;
                break;
            }
        }
        
        if (isPerfectBatch) 
        {
            System.out.println("Perfect Batch");
        }
         else 
        {
            System.out.println("Not a Perfect Batch");
        }
        scanner.close();
    }
}
