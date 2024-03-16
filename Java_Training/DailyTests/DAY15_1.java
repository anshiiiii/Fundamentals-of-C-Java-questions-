/*Gowri is doing her homework. She needs to write a paragraph about Modern History. During that time, she noticed that some words are getting repeated again and again. She started counting the number of times of particular word getting repeated. Write a java program to get a string from the user. Count the number of times a word gets repeated in the string.

Input Format:

The first line consists of a string

The second line consists of a string



Output Format:

Refer sample output for formatting specifications



Sample Input:

I felt happy because I saw the others were happy and because I knew I should feel happy

happy



Sample Output:

3*/

package Java_Training.DailyTests;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        String s2 = inp.next();
        String[] arr = s1.split(" ");
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s2)) {
                c++;
            }
        }

        System.out.println(c);
        inp.close();
    }
}

