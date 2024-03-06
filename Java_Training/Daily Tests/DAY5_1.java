/* Write a Java Program to swap two string variables without using a third or temp variable.

Input Format :

Input consist of a Strings and Integer

Output Format :

Output consist of a Strings and Integer



Sample Input :

Good 

Morning

Sample Output:

Strings before swapping: Good Morning

Strings after swapping: Morning Good*/


import java.util.Scanner;

public class DAY5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine().trim();
        String str2 = scanner.nextLine().trim();

        System.out.println("Strings before swapping: " + str1 + " " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);

        scanner.close();
    }
}
