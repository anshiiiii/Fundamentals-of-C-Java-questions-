package Java_Training.Operators;

/* Leena wanted to start a business and she was looking for a venture capitalist. Through her friend, she met a construction company owner Meena, who was interested in investing in an emerging business. Looking at the business proposal, the owner was very much impressed with Leena's work. So she decided to invest in Leena's business and hence gave a green signal to go ahead with the project. Leena got a loan of Rs. X for a period of Y years from the owner at R% interest per annum. Find the rate of interest and the total amount to be returned by Leena to the owner. The owner was impressed by the proper repayment of the financed amount and decides to give a special offer of a 2% discount on the total interest at the end of the settlement. Find the discount amount and also find the total amount given back by Leena.

Note:All rupee values should be in two decimal points.



Input Format:

Input consists of 3 floating point values.

The first one corresponds to the principal amount borrowed by Leena.

The second one corresponds to the rate of interest

The third one corresponds to the number of years.

The output consists of 4 floating point values.



Output Format:

The first value corresponds to the interest.

The second value corresponds to the amount.

The third value corresponds to the discount.

The last value corresponds to the final settlement.

All floating point values are to be rounded off to two decimal places.



Sample Input:

100

1

10



Sample Output:

10.00

110.00

0.20

109.80*/

import java.util.*;

public class Debt_Repay
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    float p,r,y,si,amt,dis,t;
    p = s.nextFloat();
    r = s.nextFloat();
    y = s.nextFloat();
    si = (p*r*y)/100;
    amt = p + si;
    dis = (si*2)/100;
    t = amt - dis;
    System.out.printf("%.2f\n%.2f\n%.2f\n%.2f",si,amt,dis,t);
    s.close();
  }
}