package MyJavaProgram;

public class program2_ {
    public static void main(String[] args) {
        int a = 90;  // you can also take input using Scanner

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("The number is Positive and Even");
            } else {
                System.out.println("The number is Positive and Odd");
            }
        } else if (a < 0) {
            System.out.println("The Number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
