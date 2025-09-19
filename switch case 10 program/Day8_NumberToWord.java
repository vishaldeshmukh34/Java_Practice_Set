// 8. Number to Word
// Write a program that takes a digit (1–9) as input and prints its word.
// Example: 1 → one, 2 → two … 9 → nine.

public class Day8_NumberToWord {
    public static void main(String[] args) {
        int num = 6;

        switch (num) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            default: System.out.println("Invalid number"); break;
        }
    }
}
