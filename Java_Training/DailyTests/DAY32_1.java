package Java_Training.DailyTests;
/*Write a program to print the Hollow square pattern.

Input Format:

Input consist of 1 integer.

Output Format:

Refer sample output.

Sample input

3

Sample output

* * *
*   *
* * *  */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
