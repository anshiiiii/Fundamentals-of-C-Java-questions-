package Java_Training.DailyTests;

/*You are given an array of coins with different denominations and an amount of money. Write a program to compute the minimum number of coins needed to make up that amount. If it's not possible to make up the amount using the given coins, return -1.



Input Format:

The input consists of two lines:



The first line contains an integer n, representing the number of coins available.



The second line contains n space-separated integers, representing the denominations of the coins.



The third line contains an integer amount, representing the target amount of money.



Output Format:

Print the minimum number of coins needed to make up the amount. If it's not possible, print -1.



Example:

Input:

5

1 2 5 10 20

23

Output:

3

Explanation: The minimum number of coins needed to make up 23 is 20 + 2 + 1 = 3 coins.*/
import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] coins = new int[n];
        
       
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        
        int amount = scanner.nextInt(); 
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0; 
        
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        
        if (dp[amount] > amount) {
            System.out.println(-1);
        } else {
            System.out.println(dp[amount]);
        }
        scanner.close();
    }
}

