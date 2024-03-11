/*Write a Java program to find the sum of factorial in given number.

Input format:

The input consist of Integer

Output format:

The output consists of Integer

Sample Input:

5

Sample Output:

153*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int factorial = 1;


        for (int i = 1; i <= n; i++) {
            factorial *= i; 
            sum += factorial; 
        }

        System.out.println(sum); 
        sc.close();
    }
}

