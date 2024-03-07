package Java_Training.Operators;

/*Though there have been more successful pirates, Blackbeard is one of the best-known and widely feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS “Scarborough” in a sea battle. He was known for barreling into the battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their shares. After sharing the gold coins in this manner, if there are any leftover coins they decided to throw them into the sea.



Input Format

Input consists of 3 integers. The first input corresponds to the number of gold coins in the treasure. The second input corresponds to Ben's share percentage. The last input corresponds to Blackbeard's share percentage.



Output Format

The output consists of three integers. The first output integer corresponds to Long Ben's share. The second output integer corresponds to Blackbeard's share. The third output should correspond to the other 3 pirates' equally divided shares.



Sample Input

729

65

87



Sample Input

473

222

11*/

import java.util.*;

public class Treasure_hunter
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n,x,y,a,b,c;
    n = s.nextInt();
    x = s.nextInt();
    y = s.nextInt();
    a = n*x/100;
    b = (n - a)*y/100;
    c = (n - a - b)/3;
    System.out.printf("%d\n%d\n%d",a,b,c);
    s.close();
  }
}