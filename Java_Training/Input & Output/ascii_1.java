/*Write a program to get a character as input and print its ASCII value. */

import java.util.Scanner;

public class ascii_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);

        int asciiValue = character;

        System.out.println(asciiValue);
        scanner.close();
    }
}
