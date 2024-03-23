/*Lee conducted a word game for his colleagues. The game is everyone should say a word that should not have any repeating characters in it. If a single
character is repeated then the particular person can't continue the game. Lee finds it difficult to disqualify the person from the game since he is not 
able to find the nonrepetitive character for all the words. Help him to find the winner of the game by writing a program to find the first element which 
is non -repetitive i.e that element must not be present anywhere else in the string.



Input Format

The first line of the input consists of a string.



Output Format

The output displays a character that is non-repetitive. If all the characters in an input string are repetitive, then display All characters are repetitive.



Sample Input 0

teeterson 



Sample Output 0

r

*/

package Java_Training.Strings;

import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) 
        {
            count[(int) str.charAt(i)]++;
        }

        boolean found = false;
        for (int i = 0; i < str.length(); i++) 
        {
            if (count[(int) str.charAt(i)] == 1) 
            {
                System.out.println(str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("All the characters are repetitive");
        }
        scanner.close();
    }
}

