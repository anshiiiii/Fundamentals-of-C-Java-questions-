package Java_Training.DailyTests;

/*Write a Java Program to print addition of N numbers.



Given N integer numbers (user will read numbers one by one) and find sum/addition of all given numbers.



Input format :

Input consist of an Integer

Output format:

Output consist of an Integer



Sample Input :

5

100

200

300

400

500

Sample Output :

1500 */
import java.util.Scanner;

public class DAY4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        
        System.out.println("" + sum);
        scanner.close();
    }
}