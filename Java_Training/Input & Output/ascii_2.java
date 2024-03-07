/*Write a program to get a number (ASCII value) as input and print its equivalent character.

 */

import java.util.Scanner;

public class ascii_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int asciiValue = scanner.nextInt();

        char character = (char) asciiValue;

        System.out.println(character);
        scanner.close();
    }
}
