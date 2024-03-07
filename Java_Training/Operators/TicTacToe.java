package Java_Training.Operators;

/*Pradeep is designing the input interaction for X-O game (a.k.a TIC-TAC-TOE). The user identifies the positions as 1|2|3 4|5|6| 7|8|9. Since the board is a 2-dimensional layout (3x3), Pradeep uses a 2-dimensional array to store board status and he identifies positions by row, and column as for first-row elements -(0,0),(0,1),(0,2) andfor second-row elements - (1,0),(1,1),(1,2) and for 3rd row elements - (2,0),(2,1),(2,2). Help Pradeep to solve the conversion from user's input (1-9) to (Row, Column) (0-2),(0-2) respectively.

Note - Indexing for rows and columns is 0-based.



Input Format

Only line of input will contain one integer n



Constraints

1 <= n <= 9



Output Format

By using the input, you have to tell the row and column number associated with it.



Sample Input

6



Sample Output

1 2

*/

import java.util.*;

public class TicTacToe
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int row,col;
    row = (n-1)/3;
    col = (n-1)%3;
    System.out.printf("%d %d",row,col);
    s.close();
  }
}
