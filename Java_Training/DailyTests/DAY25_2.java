/*Write a Java Program that Given two arrays, you need to compare them and display if they are the same or not.



Input Format:

Input consists of 2n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the first array. 

The next ‘n’ integers correspond to the elements in the second array.

Assume that the maximum value of n is 15.



Output Format:

Print yes if the 2 arrays are the same. Print no if the 2 arrays are different.



Sample Input:

5

2

3

6

8

-1

2

3

6

8

-1



Sample Output:

yes*/
package Java_Training.DailyTests;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        
    
        boolean areEqual = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                break;
            }
        }
        
      
        if (areEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
