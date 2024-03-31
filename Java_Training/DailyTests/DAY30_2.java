/*Write a Java program to print a string in reverse order.



Input Format:

Input consists of String

Output Format:

Output consist of String

Sample Input:

program fun

Sample Output:

nuf margorp

*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = ""; 

    
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); 
        }

        System.out.println(reversed);
        scanner.close();
    }
}

