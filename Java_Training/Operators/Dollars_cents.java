package Java_Training.Operators;

/* Kamal was traveling from Korea to USA and he was not aware of the currency system of USA. Can you please help him to add two dollars and cents?

Note: 1 dollar=100 cents



Input Format

Input consists of 4 integers. The first two inputs correspond to the value of the first dollar and cent. The next two inputs correspond to the value of the second dollar and cent.



Output Format

The output should print the sum of dollars and cents.



Sample Input

30

10

140

99



Sample Input

171

9

*/

import java.util.*;
public class Dollars_cents 
{

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int d1,d2,c1,c2,c,d;
        d1=z.nextInt();
        c1=z.nextInt();
        d2=z.nextInt();
        c2=z.nextInt();
        c=c1+c2;
        d=d1+d2+c/100;
        c=c%100;
        System.out.println(d);
        System.out.println(c);
        z.close();
    }
}