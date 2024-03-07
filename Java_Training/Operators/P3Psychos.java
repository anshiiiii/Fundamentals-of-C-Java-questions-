package Java_Training.Operators;

/* Mani, Arun, and Kumar were very close friends at school. They were very good in Mathematics and were the pets of Ranjani Ma'am. Mani, Arun, and Kumar live in the same locality and their gang was known as 3 - Psychos. A new student Logan joins their class and he wanted to be friends with the 3 - Psychos. Logan asked Arun about his home address. Arun wanted to test Logan's mathematical skills and hence told that his house is at the midpoint of the line joining Mani's house and Kumar's house. Logan was puzzled. Can you help Logan out? Given the coordinates of the 2 endpoints of a line (x1,y1) and (x2,y2). Write a program to find the midpoint of the line.



Input Format

Input consists of 4 integers. The first and second value corresponds to x1 and y1 respectively. The third and fourth value correspond to x2 and y2 respectively.



Output Format

Refer sample input and output for the exact formatting specifications.
Print with 1 decimal place


Sample Input:

2

4

10

15



Sample Output:

Arun's house is located at(6.0,9.5)

*/

import java.util.*;

public class P3Psychos
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int x1,y1,x2,y2;
    double xmid,ymid;
    x1 = s.nextInt();
    y1 = s.nextInt();
    x2 = s.nextInt();
    y2 = s.nextInt();
    xmid = (x1 + x2)/2.0;
    ymid = (y1 + y2)/2.0;
    System.out.printf("Arun's house is located at(%.1f,%.1f)",xmid,ymid);
    s.close();
  }
}