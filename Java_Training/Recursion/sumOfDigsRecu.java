package Java_Training.Recursion;

class SumOfDigitsRecursion {
    public static void main(String[] args) {
        int number = 12345;
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + calculateSumOfDigits(num / 10);
        }
    }
}
