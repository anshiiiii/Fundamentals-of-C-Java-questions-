/*Write a Java program to sort the first half of the given array.



Input Format:

Integer => Size of an Array

Integers =>Array Elements



Output Format:

Integer => Sorted Array



Sample Input:

6

6 7 2 3 2 1



Sample Output:

2 6 7 3 2 1*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int half = n / 2;
        for (int i = 0; i < half - 1; i++) {
            for (int j = 0; j < half - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
             
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

     
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
