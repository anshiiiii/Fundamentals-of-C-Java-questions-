/*Write a Java program to Get a number and check whether it is a

palindrome number or not.



Input format :

Input consist of an Integer.

Output format :

Output consist of a Strings.



Sample Input :

2345

Sample Output :

Not a palindrome*/
package Java_Training.DailyTests;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        
        scanner.close();
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        
        return originalNumber == reverse;
    }
}