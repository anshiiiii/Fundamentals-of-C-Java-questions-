package Java_Training;


public class Stringop {
    public static void main(String args[]) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        StringBuffer s3 = new StringBuffer("Hello");
        StringBuffer s4 = new StringBuffer("Hello");
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // false
    }
    
}
