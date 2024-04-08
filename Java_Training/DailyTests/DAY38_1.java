package Java_Training.DailyTests;
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

import java.util.Scanner;

class Main {
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
        scanner.close();
    
        int[] mergedArray = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                if (k == 0 || mergedArray[k - 1] != array1[i]) {
                    mergedArray[k++] = array1[i];
                }
                i++;
            } else if (array1[i] > array2[j]) {
                if (k == 0 || mergedArray[k - 1] != array2[j]) {
                    mergedArray[k++] = array2[j];
                }
                j++;
            } else {
                if (k == 0 || mergedArray[k - 1] != array1[i]) {
                    mergedArray[k++] = array1[i];
                }
                i++;
                j++;
            }
        }

      
        while (i < size1) {
            if (k == 0 || mergedArray[k - 1] != array1[i]) {
                mergedArray[k++] = array1[i];
            }
            i++;
        }

       
        while (j < size2) {
            if (k == 0 || mergedArray[k - 1] != array2[j]) {
                mergedArray[k++] = array2[j];
            }
            j++;
        }

       
        for (i = 0; i < k; i++) {
            System.out.print(mergedArray[i]);
            if (i < k - 1) {
                System.out.print(" ");
            }
        }
        
    }
}
