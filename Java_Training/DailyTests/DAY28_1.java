/*Gowri is doing her homework. She needs to write a paragraph about Modern History. During that time, she noticed that some words are get repeated again and again. She started counting the number of times a particular word gets repeated. Write a java program to get a string from the user. Count the number of times a word gets repeated in the string.



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
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String word = scanner.nextLine();
        int count = countOccurrences(sentence, word);
        System.out.println(count);
        scanner.close();
    }
    
    private static int countOccurrences(String sentence, String word) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}