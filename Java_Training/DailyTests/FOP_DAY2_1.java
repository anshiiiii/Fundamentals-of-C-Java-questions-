/*Write a program to print in a star pattern.



Input Format

Input consists of one integer that corresponds to the number of pattern rows.



Output Format

Output prints the pattern.



Sample Input 0

10



Sample Output 0

**********

*********

********

*******

******

*****

****

***

**

* */

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); 

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
