/*Jammy and Lily were friends. Jammy needs help from Lily and he says, "At the end of each day, I need to calculate if we have incurred a profit or a loss. Each day, I am assigned Rs.X to run the counter. At the end of the day, we earn Rs.Y through the counter. Could you calculate and tell me if we've had a profit or loss and by how much %." Write a Java program to find the solution for Jammy's question.

Input Format:

First input corresponds to the assigned amount by Jammy (Integer)

Second input corresponds to the earned amount (Integer)



Output Format:

output corresponds to the profit or loss in terms of percentage



Sample Input:

1200

1500



Sample Output:

Profit - 25%*/

package Java_Training.DailyTests;

import java.util.*;

public class DAY16_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        inp.close();
        
        if (a <= 0 || b <= 0) {
            System.out.println("Invalid Data");
            return;
        }
        
        int temp = returns(a, b);
        double per = ((double) Math.abs(b - a) / a) * 100;
        
        if (temp > 0)
            System.out.printf("Profit - %.0f%%", per);
        else if (temp < 0)
            System.out.printf("Loss - %.0f%%", per);
        else
            System.out.println("No Profit No Loss");
    }
    
    
    public static int returns(int a, int b) {
        return (b - a);
    }
}
