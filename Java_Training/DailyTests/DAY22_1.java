/*Write a Java program to find the Arranging Strings in an Alphabetical Order.

Input format:

The input consist of Integer and String



Output format:

The output consists of String



Note: Enter size of array and then enter all the names in that array. Now with the help of compareTo operator we can easily arranging names in Alphabetical Order.



Sample Input:

4

Run

Ate

Bat

Sun



Sample Output:

Ate

Bat

Run

Sun*/

package Java_Training.DailyTests;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] strings = new String[size];

        for (int i = 0; i < size; i++) {
            strings[i] = scanner.next();
        }

        Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }
        scanner.close();
    }
}