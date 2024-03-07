/*Write a Java program to Get a number and check whether it is a

palindrome number or not.



Input format :

Input consist of an Integer.

Output format :

Output consist of a Strings.



Sample Input :

2345

Sample Output :

Not a palindrome

*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY6_2
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int reversed = 0, original = num;
        while (num > 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        if (original == reversed) 
        {
            System.out.println("Palindrome");
        } 
        else
        {
            System.out.println("Not a palindrome");
        }
        scanner.close();
    }
}