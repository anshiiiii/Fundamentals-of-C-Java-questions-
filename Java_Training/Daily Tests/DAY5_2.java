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

3

 */


import java.util.Scanner;

public class DAY5_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().toLowerCase();
        String wordToCount = scanner.nextLine().toLowerCase();
        int count = countOccurrences(inputString, wordToCount);

        System.out.println(count);

        scanner.close();
    }

    private static int countOccurrences(String inputString, String wordToCount) {

        String[] words = inputString.split("\\s+");

        int count = 0;

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.equals(wordToCount)) {
                count++;
            }
        }

        return count;
    }
}