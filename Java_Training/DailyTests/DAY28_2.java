/*Write a Java Program to swap two string variables without using a third or temp variable.

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
package Java_Training.DailyTests;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        System.out.println("Strings before swapping: " + a + " " + b);

        
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("Strings after swapping: " + a + " " + b);
        scanner.close();
    }
}
