package Java_Training.Arrays1D;

import java.util.Scanner;

public class BigHouse_Toyland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] houseNum = new int[num];
        int[] pos = new int[num];
        for (int i = 0; i < num; i++) {
            houseNum[i] = sc.nextInt();
            pos[i] = sc.nextInt();
        }

        // Bubble sort based on positions
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {  //n-i-1 ensure adjacent elements coparision
                if (pos[j] > pos[j + 1]) {
                    int temp = pos[j];
                    pos[j] = pos[j + 1];
                    pos[j + 1] = temp;
                    temp = houseNum[j];
                    houseNum[j] = houseNum[j + 1];
                    houseNum[j + 1] = temp;
                }
            }
        }

        // Find the maximum gap
        int maxGap = 0;
        int house1 = 0, house2 = 0;
        for (int i = 0; i < num - 1; i++) {
            if (pos[i + 1] - pos[i] > maxGap) {
                maxGap = pos[i + 1] - pos[i];
                house1 = houseNum[i];
                house2 = houseNum[i + 1];
            }
        }

        // Print the house numbers in ascending order
        if (house1 < house2)
            System.out.println(house1 + " " + house2);
        else
            System.out.println(house2 + " " + house1);
        sc.close();
    }
}
