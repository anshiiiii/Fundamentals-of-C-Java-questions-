/*There was a boy named Ziro having fun by asking the people of their's initial. If the people who has vowel character as their initial and says that to him, he just replies "WOW, Hello!", else he replies "Continue to soar higher!". If the initial is out of alphabet, then he replies "That's a weird initial! I like it!". Write a Java program to help him out to find vowels and consonants.

Input Format:

Input corresponds to the character.



Output Format:

Refer the following sample output



Sample Input:

E



Sample Output:

WOW, Hello!*/

package Java_Training.DailyTests;

import java.util.*;
class Main{
  public static void main(String[] args){
      Scanner inp = new Scanner(System.in);
	  char c = inp.nextLine().charAt(0);
	  c = Character.toUpperCase(c);
	  if(Character.isDigit(c)) System.out.println("That's a weird initial! I like it!");
	  else if(c == 'A' || c=='E'|| c == 'I' || c == 'O' || c == 'U') System.out.println("WOW, Hello!");
	  else System.out.println("Continue to soar higher!");
      inp.close();
  }
}
