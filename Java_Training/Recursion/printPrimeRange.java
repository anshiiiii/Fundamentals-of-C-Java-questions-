package Java_Training.Recursion;

class PrimeNumbersInRange {

    // Function to check if a number is prime
    private static boolean isPrime(int num, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor - 1);
    }

    // Function to print prime numbers in a given range
    private static void printPrimesInRange(int start, int end) {
        if (start > end) {
            return;
        }
        if (isPrime(start, start / 2)) {
            System.out.print(start + " ");
        }
        printPrimesInRange(start + 1, end);
    }

    public static void main(String[] args) {
        int startRange = 10; 
        int endRange = 50; 

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        printPrimesInRange(startRange, endRange);
    }
}
