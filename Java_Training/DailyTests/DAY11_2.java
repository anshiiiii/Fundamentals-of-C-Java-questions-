/*Write a Java program to merge given two sorted arrays such that the elements are not repeated.



Input format :

Input consist of an Integer.

Output format :

Output consist of an Integer.



Sample Input:

Size: 8

Array 1: 2, 4, 5, 6, 7, 9, 10, 13

Size: 10

Array 2: 2, 3, 4, 5, 6, 7, 8, 9, 11, 15



Sample Output:

2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15*/

package Java_Training.DailyTests;

import java.util.*;

public class DAY11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        
        int[] mergedArray = mergeArrays(array1, array2);
        printArray(mergedArray);
        
        scanner.close();
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                result[k++] = arr2[j++];
            } else {
                result[k++] = arr1[i++];
                j++;
            }
        }
        
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return Arrays.copyOf(result, k);
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}