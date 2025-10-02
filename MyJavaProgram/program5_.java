import java.util.Scanner;

public class program5_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter day (0=Sun, 1=Mon, ... 6=Sat): ");
        int day = sc.nextInt();

        System.out.print("Are you on vacation? (true/false): ");
        boolean vacation = sc.nextBoolean();

        // Logic for alarm clock
        String alarm;
        if (!vacation) {
            if (day >= 1 && day <= 5) {
                alarm = "7:00";
            } else {
                alarm = "10:00";
            }
        } else {
            if (day >= 1 && day <= 5) {
                alarm = "10:00";
            } else {
                alarm = "off";
            }
        }

        // Output result
        System.out.println("Alarm: " + alarm);
    }
}
