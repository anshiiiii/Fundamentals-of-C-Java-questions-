/*John likes to solve every problem he encounters, one day he is passing by a street and he saw someone asking a problem by a boy so he decided to solve it first and then for surety he will give the solution to that person and ask if it is correct or not.

The Question goes like this :

A boy has an array A of n positive integers indexed from 1 to n and at ith index the present is A[i].

Additionally the Boy has m queries to the array, each query is characterized by a pair of integers l[j] and r[j] (1 ≤l[j] ≤ r[j] ≤ n). For each query l[j], r[j] the Little Elephant has to count, how many numbers x exist, such that number x occurs exactly x times among numbers A[ l[j] ], A[ l[j + 1] ], . . ., A[ r[j] ].

Help the boy to count the answers to all queries.



Input Format :



The first line contains two space-separated integers n and m (1 ≤ n, m ≤ 10^4) — the size of array a and the number of queries to it.

The next line contains n space-separated positive integers A1, A2, . . . , An (1 ≤ Ai ≤ 10^7).

Next m lines contain descriptions of queries, one per line. The j-th of these lines contains the description of the j-th query as two space-separated integers l[j] and r[j] (1 ≤ l[j] ≤ r[j] ≤ n).



Output Format :

In m lines print m integers — the answers to the queries. The j-th line should contain the answer to the j-th query.



Sample Input :

7 2

3 1 2 2 3 3 7

1 7

3 4



Sample Output :

3

1*/

package Java_Training.DailyTests;

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt() - 1; 
            int r = scanner.nextInt() - 1; 
            System.out.println(countXOccurrences(A, l, r));
        }
        
        scanner.close();
    }
    
    private static int countXOccurrences(int[] A, int l, int r) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = l; i <= r; i++) {
            frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i], 0) + 1);
        }
        
        int count = 0;
        for (int x : frequencyMap.keySet()) {
            if (frequencyMap.get(x) == x) {
                count++;
            }
        }
        
        return count;
    }
}
