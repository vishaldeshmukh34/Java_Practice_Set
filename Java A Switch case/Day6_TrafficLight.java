// 6. Traffic Light
// Accept a string (Red, Yellow, Green) as input.
// Use switch-case to print the action to take:
// Red → Stop, Yellow → Get Ready, Green → Go.

public class Day6_TrafficLight {
    public static void main(String[] args) {
        String light = "yellow";

        switch (light.toLowerCase()) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Get Ready"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Please enter the correct light"); break;
        }
    }
}
