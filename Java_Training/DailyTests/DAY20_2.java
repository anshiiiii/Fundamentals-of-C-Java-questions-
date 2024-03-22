/*Checking Alphabets



Write a java program to check whether the given character is vowel or consonant. Input format: The input consist of a character

Output format: The output consists of a below-given string "Vowel" / "Consonant" / "Not an alphabet"



Sample Input:



a



Sample Output:



Vowel*/

package Java_Training.DailyTests;


import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner inp = new Scanner(System.in);
	  char c = inp.nextLine().charAt(0);
	  c = Character.toLowerCase(c);
	  if(Character.isDigit(c)) System.out.println("Not an alphabet");
	  else if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') System.out.println("Vowel");
	  else System.out.println("Consonant");
      inp.close();
  }
}
