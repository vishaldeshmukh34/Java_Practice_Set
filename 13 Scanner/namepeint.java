import java.util.Scanner;

public class namepeint {
    // WAP to accept first name, middle name and surname and print full name.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Name :- ");
        String firstname = sc.nextLine();
        System.out.println("Enter Your First Name :- ");
        String middlename = sc.nextLine();
        System.out.println("Enter Your First Name :- ");
        String lastname = sc.nextLine();

        System.out.println("Your Full Name :- "+firstname  +" "+ middlename +" "+ lastname);

    }
}
