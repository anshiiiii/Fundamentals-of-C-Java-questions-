package Java_Training.DailyTests;

/*A special school is run by an NGO for kids with Dyslexia. As we all know these children will start writing the letters backwards or in reverse. Once special care is taken to correct this issue and once they are introduced to words, they will start writing the words in reverse. The teachers do not want to discourage the children at the start itself and they have decided to mark the works written in reverse also as correct. Can you please help the teacher in correcting the answer sheets by writing a JAVA program? Write a JAVA program to check whether the second word is the reverse of first word. Do not use strrev function.



Input Format:

Input consists of 2 strings. Assume that the maximum length of the string is 50.



Output Format:

If the two strings are same print "It is same" else print "It is not same".



Sample Input:

Excellent

tnellecxE



Sample Output:

It is same */

import java.util.Scanner;

public class DAY3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstWord = s.next();
        String secondWord = s.next();
        

        if (isReverse(firstWord, secondWord)) {
            System.out.println("It is same");
        } else {
            System.out.println("It is not same");
        }
        s.close();
    }

    public static boolean isReverse(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(second.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
}