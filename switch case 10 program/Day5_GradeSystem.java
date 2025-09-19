// 5. Grade System
// Accept a character as input representing grades (A, B, C, D, F).
// Use switch-case to display a remark:
// A → Excellent, B → Good, C → Average, D → Poor, F → Fail.

public class Day5_GradeSystem {
    public static void main(String[] args) {
        char grade = 'B';

        switch (Character.toUpperCase(grade)) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Poor"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Please enter a correct grade"); break;
        }
    }
}
