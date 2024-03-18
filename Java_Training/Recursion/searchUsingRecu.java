package Java_Training.Recursion;

import java.util.Scanner;

class RecursiveSearch {
    
    public static int recursiveSearch(int[] arr, int target, int index) {
        if (index >= arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return recursiveSearch(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int result = recursiveSearch(arr, target, 0);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}

