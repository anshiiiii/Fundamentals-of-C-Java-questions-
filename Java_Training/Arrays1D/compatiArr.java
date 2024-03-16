package Java_Training.Arrays1D;



import java.util.Scanner;

public class compatiArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int n1 = scanner.nextInt();

       
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

       
        int n2 = scanner.nextInt();

 
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

 
        boolean isCompatible = true;
        if (n1 != n2) {
            isCompatible = false; 
        } else {
            for (int i = 0; i < n1; i++) {
                if (arr1[i] < arr2[i]) {
                    isCompatible = false; 
                    break;
                }
            }
        }


        if (isCompatible) {
            System.out.println("Compatible");
        } else {
            System.out.println("Incompatible");
        }
        scanner.close();
    }
}
