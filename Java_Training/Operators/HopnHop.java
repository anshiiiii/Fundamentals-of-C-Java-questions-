package Java_Training.Operators;

/*Peter Rabbit lives in a colony. He is the only rabbit in his colony who is not able to hop. On his 5th birthday, his father Rabbit gifted him a pogo stick as he could not jump like the other rabbits. He is so excited to play with the pogo stick. The pogo stick hops one unit per jump. He wanders around his house jumping with pogo sticks. He wants to show the pogo stick to his friend and decides to go using his pogo stick. Write a program to find the number of hops needed to reach his friends' house (x,y). Assume that Peter Rabbit's house is in the coordinates (3,4).



Input Format

Input consists of two integers x and y.



Output Format

The output is an integer. It corresponds to the number of hops needed to reach his friend's house.



Sample Input

5 

10 



Sample Output

6

*/

import java.util.*;

public class HopnHop
 {
   public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     int x,y;
     x = s.nextInt();
     y = s.nextInt();
     int ans=(int)Math.sqrt(Math.pow(x-3,2)+Math.pow(y-4,2));
     System.out.print(ans);
     s.close();
   }
 }