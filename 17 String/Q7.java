import java.util.Scanner;

public class Q7 {
    
//3.WAP to accept password from the user and count no of alphabets and digits.

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Password :- ");

     String password = sc.nextLine();

     int letters = 0, digits = 0;

     for(int i = 0 ; i < password.length(); i++);
     {
        char cha = password.charAt(i);
     }

     if(Character.isLetter(ch))
     {
        letters++;
     }
     else if (Character.isDigit(ch))
     {
        digits++;
     }

                System.out.println("Number of Alphabets: " + letters);
		        System.out.println("Number of Digits: " + digits);
}
}
