
package Java_Training.DailyTests;
/*There are n people with pens. You are given an integer array pens, where each pens[i] represents the number of pens the ith person has, and an integer extraPens, denoting the number of extra pens that you have.

Print an array result of length n, where result[i] is 1 if, after giving the ith person all the extraPens, they will have the greatest number of pens among all, or 0 otherwise.

Note that multiple persons can have the greatest number of pens.



Input Format:

First line - a single integer n which represents the number of person (n >= 0)

Second line - an array A of n integers denoting the number of pens they have (A[i] >= 0)

Third line - a single integer extraPens denoting the number of extra pens that you have (extraPens >= 0)



Output Format:

An array result of n elements, where result[i] is 1 if, after giving the ith person all the extraPens, they will have the greatest number of pens among all, or 0 otherwise.



Sample Input:

5

2 3 4 1 0

2



Sample Ouput:

1 1 1 0 0*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pens = new int[n];
        
        for (int i = 0; i < n; i++) {
            pens[i] = scanner.nextInt();
        }
        
        int extraPens = scanner.nextInt();
        
        int maxPens = 0;
        for (int i = 0; i < n; i++) {
            maxPens = Math.max(maxPens, pens[i]);
        }
        
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (pens[i] + extraPens >= maxPens) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        scanner.close();
    }
}