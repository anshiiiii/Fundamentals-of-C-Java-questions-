/*Write a Java program to find the power of a given number using recursion

Input Format:

Input consists of Integers.

Output Format:

Output consists of Integer.

Sample Input:

3

4

Sample Output:

81*/

package Java_Training.DailyTests;


import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
      Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        scanner.close();
     System.out.println(power(base, exponent));
    }

public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
