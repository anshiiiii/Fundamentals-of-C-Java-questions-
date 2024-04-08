package Java_Training.DailyTests;
/*Write a Java program to remove duplicate letters in the given string and print them in ascending order using set.



Input Format:

Input consists of String



Output Format:

Output consists of Character set.



Sample Input:

Iron Man



Sample Output:

[ , a, i, m, n, o, r]*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        String input = scanner.nextLine();
        scanner.close();
        
        Set<Character> uniqueChars = new TreeSet<>();
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                uniqueChars.add(Character.toLowerCase(c));
            }
        }

        System.out.println(uniqueChars);
    }
}