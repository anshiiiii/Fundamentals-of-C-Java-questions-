/*Write a program to sort the first half of an array in ascending order and the second half in descending order.

Input Format:

The first line contains an integer 'N', denoting the size of the array.

The next line contains space-separated integers denoting the elements of the array.



Output Format:

Print sorted array



Sample Input:

6

1 2 3 4 5 6



Sample Output:

1 2 3 6 5 4*/

package Java_Training.DailyTests;

import java.util.*;

class Main 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) 
		{
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, 0, N / 2);
        Arrays.sort(arr, N / 2, N);
        reverse(arr, N / 2, N - 1);
        for (int i = 0; i < N; i++) 
		{
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
    public static void reverse(int[] arr, int start, int end) 
	{
        while (start < end) 
		{
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}