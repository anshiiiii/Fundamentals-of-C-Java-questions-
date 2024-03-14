/*Write a Java program to remove duplicate letters in the given string and print them in ascending order using set.



Input Format:

Input consists of String



Output Format:

Output consists of Character set.



Sample Input:

Iron Man



Sample Output:

[ , a, i, m, n, o, r]*/

package Java_Training.DailyTests;

import java.util.*;

public class DAY11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Set<Character> charSet = removeDuplicates(input);
        
        System.out.println(charSet);
        
        scanner.close();
    }
    
    public static Set<Character> removeDuplicates(String str) {
        Set<Character> charSet = new TreeSet<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                charSet.add(Character.toLowerCase(ch));
            } else if (ch == ' ') {
                charSet.add(ch);
            }
        }
        return charSet;
    }
}
