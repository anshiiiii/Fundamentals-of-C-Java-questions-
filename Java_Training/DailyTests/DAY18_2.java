/*Write a Java program for the following series 462 420 380 342 306.....



Input Format:

Inputs correspond to the number of terms (Integer)



Output Format:

Refer the sample output



Sample Input1:

5



Sample Output1:

462 420 380 342 306*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTerms = scanner.nextInt();
        
        if (numTerms <= 0) {
            System.out.println("Invalid Data");
        } else {

            int term = 462;
            
   
            System.out.print(term);

            for (int i = 0; i < numTerms-1; i++) {
                term -= 42 - (2 * i);
                System.out.print(" " + term);
            }
        }
        
        scanner.close();
    }
}
