package Java_Training.DailyTests;

import java.util.Arrays;
import java.util.Scanner;

public class DAY19_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        System.out.println("Total possible triangles:");
        System.out.println(count);
        scanner.close();
    }
}

