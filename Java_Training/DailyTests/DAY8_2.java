/*Ramu works in a project to construct a 20-storey building. In that building, the swimming pool area should be circular or 
rectangular in shape. If it is circular, then the radius of the swimming pool is X meters. If it is rectangular, then the length 
and breadth of the swimming pool is y and z meters. Ramu has to know the total area of the swimming pool (both circular and 
rectangular). Write a java program to find the total area of the swimming pool (both circular and rectangular shape) and to print 
which swimming pool covers the largest area.[Note: don’t use if else statement]



Input Format:

The first line of the input consists of a value which is the radius of the circular swimming pool

The second and third line consists of length and breadth of the rectangular swimming pool

Output Format:

The first and second line of the output consists of a double value in which only two numbers after the decimal point.

Third line is a string which points out the largest area

Sample Input:

75

100

75

Sample Output:

471.00

350.00

Circular Swimming pool covers larger area*/

package Java_Training.DailyTests;

import java.util.*;

public class DAY8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        scanner.close();
        double circularArea = 2*3.14*radius;
        double rectangularArea = 2*(length + breadth);
        System.out.printf("%.2f\n", circularArea);
        System.out.printf("%.2f\n", rectangularArea);
        String largestPool = (circularArea > rectangularArea) ? "Circular Swimming pool covers larger area" : "Rectangular Swimming pool covers larger area";
        System.out.println(largestPool);
		
    }
}