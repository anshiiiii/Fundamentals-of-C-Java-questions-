/*Write a Java program to find the sum of numbers in the given alpha numeric string.

Input format:

The input consist of Integer and String

Output format:

The output consists of Integer

Sample Input:

20ea4t

Sample Output:

24

*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    sum += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }

        if (num.length() > 0) {
            sum += Integer.parseInt(num.toString());
        }

        System.out.println(sum);
        
        scanner.close();
    }
}