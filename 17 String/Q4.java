import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = ""; // to store reversed string

        // reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // compare original and reversed string
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a Palindrome!");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
