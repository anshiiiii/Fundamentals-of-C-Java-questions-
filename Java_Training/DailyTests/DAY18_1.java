package Java_Training.DailyTests;

/*Write a Java program to find rotate a string based on given input.

Note:

First input is consist on String

Second input is consist on Integer(based on rotation)

Input format:

The input consist of Integer and String

Output format:

The output consists of String

Sample Input:

Scanner

4

Sample Output:

nnerSca*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        String str = scanner.nextLine();
        int rotation = scanner.nextInt();
        

        String rotatedString = rotateString(str, rotation);
        
       
        System.out.println(rotatedString);
        
        scanner.close();
    }
    
    public static String rotateString(String str, int rotation) {
        int n = str.length();
        rotation %= n; 
        
        return str.substring(n - rotation) + str.substring(0, n - rotation);
    }
}
