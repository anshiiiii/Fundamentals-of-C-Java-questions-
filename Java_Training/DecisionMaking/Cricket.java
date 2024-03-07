package Java_Training.DecisionMaking;

/*Praveen is crazy about IPL. He was watching Mumbai Indians vs. Chennai Super Kings final match. Mumbai won the toss and elected to bat first. They finished batting with a score of X. Next, Chennai started to bat and scored Y runs in N number of balls. Now, Praveen wants to calculate the run rate and check whether there is a probability for Chennai to win or not. Help him calculate the run rate and check the probability.



Input Format :

Input consists of 4 integers.

The first input corresponds to the total number of balls.

The second input corresponds to the total number of runs.

The third input corresponds to the number of runs scored.

The fourth input corresponds to the number of balls bowled.



Output Format:

The first output corresponds to the total number of overs.

The second output corresponds to the total number of overs finished.

The third output corresponds to the current run rate.

The fourth output corresponds to the total run rate.



Sample Input 1:

300

375

78

45



Sample Output 1:

50

7.3

10.7

7.5

Eligible to Win



Sample Input 2:

300

268

23

45



Sample Output 2:

50

7.3

3.2

5.4

Not Eligible to Win*/

import java.util.*;

public class Cricket
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int tb,tr,rs,bb,to,b1,b2;
    tb = s.nextInt();
    tr = s.nextInt();
    rs = s.nextInt();
    bb = s.nextInt();
    to = tb/6;
    b1 = bb/6;
    b2 = bb%6;
    double tof = b1 + b2*0.1;
    double crr = rs/tof;
    double trr = (double)tr/to;
    System.out.printf("%d\n",to);
    System.out.printf("%.1f\n",tof);
    System.out.printf("%.1f\n",crr);
    System.out.printf("%.1f\n",trr);
    if(crr > trr)
      System.out.println("Eligible to Win");
    else
      System.out.println("Not Eligible to Win");
    s.close();
  }
}