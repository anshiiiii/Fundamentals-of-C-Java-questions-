/*Write a Java program to print the given number is armstrong number or not.



Input Foramt:

Input consists of Integer

Output Format:

Refer the sample output

Sample Input 1:

407

Sample Output 1:

407 is an Armstrong number

Sample Input 2:

372

Sample Output 2:

372 is not an Armstrong number*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        
        scanner.close();
    }
    
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
}