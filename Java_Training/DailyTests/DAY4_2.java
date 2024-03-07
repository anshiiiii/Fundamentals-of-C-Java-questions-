package Java_Training.DailyTests;

/*Write a Java Program to Print a Diamond Shape Pattern.



Input format:

Input consist of an Integer.

Output format:

Output consist of a



Sample Input :

5

Sample Output :

 *\n  ***\n *****\n *******\n*********\n *******\n *****\n  ***\n  * */
import java.util.Scanner;

public class DAY4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        scanner.close();
    }
}