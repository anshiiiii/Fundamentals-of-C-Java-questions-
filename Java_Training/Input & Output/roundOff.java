/*Write a program to get a float value from the user and display it in the below-mentioned format.

HINT: Use ceil() and floor() functions from the header file.



Input & Output Format:

Input consists of one float value.

The output consists of one integer, its rounded-up value, and its rounded-down value.



Sample Input 1:

54.5



Sample Output 1:

54

55

54



Sample Input 2:

66.7



Sample Output 2:

66

67

66 */

import java.util.Scanner;
import java.lang.Math;

public class roundOff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float value = scanner.nextFloat();

        int intValue = (int) value;
        int roundedDown = (int) Math.floor(value);
        int roundedUp = (int) Math.ceil(value);

        System.out.println(intValue);
        System.out.println(roundedUp);
        System.out.println(roundedDown);
        scanner.close();
        
    }
}
