import java.util.Scanner;

public class D {
    public static void main(String[] args) {

// Q.D]  ATM Menu
// Show a menu:
// 1 → Withdraw
// 2 → Deposit
// 3 → Check Balance
// 4 → Exit
// Use switch to handle user choice.
        

             Scanner sc = new Scanner(System.in);
       
         System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println( "Withdraw");
                
                break;
            case 2: System.out.println( "Deposit");
                
                break;
            case 3: System.out.println( "Check Balance");
                
                break;
            case 4: System.out.println(" Exit");
                
                break;
        
            default: System.out.println("Invalid choice");
                break;
        }
    }
}


