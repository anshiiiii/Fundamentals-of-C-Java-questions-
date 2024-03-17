package Java_Training.Arrays2D;

import java.util.Scanner;

public class Move_all_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            String input = sc.next();
            int len = input.length();
            int countZeros = 0;


            for (int i = 0; i < len; i++) {
                if (input.charAt(i) == '0') {
                    countZeros++;
                }
            }

           
            for (int i = 0; i < len - countZeros; i++) {
                System.out.print("1");
            }
            for (int i = 0; i < countZeros; i++) {
                System.out.print("0");
            }
            System.out.println(); 
        }
        sc.close();
    }
}
