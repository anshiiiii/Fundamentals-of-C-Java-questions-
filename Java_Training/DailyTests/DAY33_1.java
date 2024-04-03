package Java_Training.DailyTests;


/*Given an array A of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.



For Sample Input and Output format, go to Sample cases.



Sample Example 1:

Input:
N = 7
2 6 1 9 4 5 3
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.




Sample Example 2:

Input:
N = 7
1 9 3 10 4 20 2
Output:
4
Explanation:
1, 2, 3, 4 is the longest
consecutive subsequence.




Constraints:

1 <= N <= 10^5

0 <= A[i] <= 10^5

 */

import java.util.Scanner;
import java.util.HashSet;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        
       
        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }
        
        int longestStreak = 0;
        
        for (int num : set) {
            if (!set.contains(num - 1)) { 
                int currentNum = num;
                int currentStreak = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        System.out.println(longestStreak);
        scanner.close();
    }
}
