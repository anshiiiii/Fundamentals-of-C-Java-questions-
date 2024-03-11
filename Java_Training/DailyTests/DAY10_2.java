/*Write a Java program to find the reverse an array in the given array.

Input format:

The input consist of Integer

Output format:

The output consists of Integer

Sample Input:

3

3 2 1

Sample Output:

1 2 3*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
