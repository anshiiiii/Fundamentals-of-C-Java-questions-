package Java_Training.DailyTests;
/*A character string is said to have period k if it can be formed by concatenating one or more repetitions of another string of length k. For example, the string ”abcabcabcabc” has period 3, since it is formed by 4 repetitions of the string ”abc”. It also has periods 6 (two repetitions of ”abcabc”) and 12 (one

repetition of ”abcabcabcabc”).

Write a program to read a character string and determine its smallest period.



Input Format:

A string s.



Output Format:

Print its smallest period



Sample Input1:

abcabcabcabc



Sample Output1:

3



Sample Input2:

abcd



Sample Output2:

4*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        int smallestPeriod = findSmallestPeriod(s);
        System.out.println(smallestPeriod);
        scanner.close();
    }
    
    public static int findSmallestPeriod(String s) {
        int n = s.length();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                String pattern = s.substring(0, i);
                boolean isPeriod = true;
                
                for (int j = i; j < n; j += i) {
                    if (!s.substring(j, j + i).equals(pattern)) {
                        isPeriod = false;
                        break;
                    }
                }
                
                if (isPeriod) {
                    return i;
                }
            }
        }
        
        return n;
    }
}