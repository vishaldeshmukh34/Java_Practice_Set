import java.util.Scanner;
//WAM to create a Number Guessing Game.
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random() * 100) + 1; // random number 1-100
        int userNumber = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");

        do {
            System.out.print("👉 Guess My Number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("🎉 WOOHOO.. CORRECT NUMBER!! 🎉");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("📈 Your Number is Too Large!");
            } else {
                System.out.println("📉 Your Number is Too Small!");
            }
        } while (userNumber >= 0);

        System.out.println("✅ My Number Was: " + myNumber);
        sc.close();
    }
}
