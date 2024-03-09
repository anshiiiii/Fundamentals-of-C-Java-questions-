/*Write a Java program to find the perfect numbers and its count between a given range.

Input Format:

The first input contains an integer which denotes the starting number of the range

The second input contains an integer which denotes the ending number of the range

Output Format:

Print the perfect numbers and its count in a given range

Sample Input:

1

10

Sample Output:

6

count : 1*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        sc.close();
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i && sum != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}

