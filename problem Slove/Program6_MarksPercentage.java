
// 6. WAP to accept marks of 5 subjects, calculate total, average & display percentage.

public class Program6_MarksPercentage {
    public static void main(String[] args) {
        int Math = 100;
        int English = 80;
        int Science = 50;
        int Physics = 90;
        int History = 56;
       
        double sum = Math + English + Science + Physics + History;
        double average = sum / 5.0;
        double percentage = (sum / 500.0) * 100;
        
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Of Marks: " + average);
        System.out.println("Percentage Of Student: " + percentage);
    }
}
