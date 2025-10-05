import java.util.Scanner;

public class G {

         //Take input as a character: R → Stop . Y → Wait .G → Go 

gti
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Traffic Light (R/Y/G): ");
        char signal = sc.next().toUpperCase().charAt(0);

        switch (signal) {
            case 'R':
                System.out.println("Stop 🚦");
                break;
            case 'Y':
                System.out.println("Wait ⚠️");
                break;
            case 'G':
                System.out.println("Go ✅");
                break;
            default:
                System.out.println("Invalid Input! Please enter R, Y, or G.");
        }
    }
}
