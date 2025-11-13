// 2. WAP to accept username & password from the user and check if the login is successful or not.
// Note: successful login attempt = username and password must be same

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The User Name :- ");

        
        String username  = sc.next();

        System.out.println("Enter The password : -");
        String password  = sc.next();

        if(username.equals(password))
        {
         System.out.println("Login Successful ✅");
        } else {
            System.out.println("Login Failed ❌");
        }

	}

        
    }
