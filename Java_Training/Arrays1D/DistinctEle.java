package Java_Training.Arrays1D;

import java.util.Scanner;

public class DistinctEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        
        boolean[] isDistinct = new boolean[101]; 

        int distinctCount = 0;
        for (int i = 0; i < n; i++) {
            if (!isDistinct[arr[i]]) {
                isDistinct[arr[i]] = true;
                distinctCount++;
            }
        }


        System.out.println("There are " + distinctCount + " distinct element in the array.");
        scanner.close();
    }
    
}
