public class Student {
    private int rollNo;
    private double marks;

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setMarks(89.5);
        s.displayDetails();
    }
}
