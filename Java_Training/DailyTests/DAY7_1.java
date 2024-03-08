/*Write a Java program to check whether the given integer is a happy number or unhappy number. [Note: A happy number is a number that leads to 1 after a sequence of steps where in each step, number is replaced by sum of squares of its digit].

Input Format:

Input consists of an integer value



Output Format:

Output consists of a string

Refer sample output for formatting specifications



Sample Input:

49



Sample Output:

Happy number*/

package Java_Training.DailyTests;

import java.util.Scanner;

public class DAY7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n, f = n;
        do {
            s = num(s);
            f = num(num(f));
        } while (s != f);
        if (s == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Unhappy Number");
        }
        sc.close();
    }

    public static int num(int n) {
        int s = 0, r;
        while (n != 0) {
            r = n % 10;
            s += r * r;
            n = n / 10;
        }
        return s;
    }
}

