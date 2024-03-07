package Java_Training.DecisionMaking;

/*Richard Castle wants to buy a shirt. As he is very lazy, he decided to buy the shirt online. He chooses a shirt on Flipkart and is surprised to see the same shirt on Flipkart, Snapdeal, and Amazon as well. So he decided to buy the shirt from the website which offers the least price. The price of the shirt, the discount percentage, and the shipping charges of all three websites have been given as input. Help him in calculating the price of the shirt on each website and decide which website has the lowest price. If the amount is the same on all three websites then the priority goes to Flipkart, Snapdeal and Amazon.



Input Format:

Input consists of 9 integers.

The first three input corresponds to Flipkart details such as the price of the shirt, discount offered, and shipping charges.

The next three input corresponds to Snapdeal details such as the price of the shirt, discount offered, and shipping charge.

The last three input corresponds to Amazon details such as the price of the shirt, discount offered, and shipping charge.



Output Format:

The Output consists of three integers that denote the prices on Flipkart, Snapdeal, and Amazon and should suggest the website that has the lowest price.



Sample Input 1:

1000

50

50

900

50

70

800

10

200



Sample Output 1:

In Flipkart: Rs.550

In Snapdeal: Rs.520

In Amazon: Rs.920

Choose Snapdeal



Sample Input 2:

1000

60

80

900

50

30

1000

10

200



Sample Output 2:

In Flipkart: Rs.480

In Snapdeal: Rs.480

In Amazon: Rs.1100

Choose Flipkart*/


import java.util.*;
public class Online_shop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int fp = sc.nextInt(), fd = sc.nextInt(), fs = sc.nextInt();
        int sp = sc.nextInt(), sd = sc.nextInt(), ss = sc.nextInt();
        int ap = sc.nextInt(), ad = sc.nextInt(), as = sc.nextInt();
        int flip, snap, amaz;
        flip = (int)(fp-(fd*0.01*fp) + fs);
        snap = (int)(sp-(sd*0.01*sp) + ss);
        amaz = (int)(ap-(ad*0.01*ap) + as);
        if(flip > snap)
        {
            System.out.println("In Flipkart: Rs."+flip+"\nIn Snapdeal: Rs."+snap+"\nIn Amazon: Rs."+amaz+"\nChoose Snapdeal");
        }
        else if(snap > amaz)
        {
           System.out.println("In Flipkart: Rs."+flip+"\nIn Snapdeal: Rs."+snap+"\nIn Amazon: Rs."+amaz+"\nChoose Amazon") ;
        }
        else 
            System.out.println("In Flipkart: Rs."+flip+"\nIn Snapdeal: Rs."+snap+"\nIn Amazon: Rs."+amaz+"\nChoose Flipkart");
        sc.close();
     
    }
}