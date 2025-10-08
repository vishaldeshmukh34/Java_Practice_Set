// Q1. Create a class Student with variables name, rollNo, and marks.
class Student {
    String name;
    int rollNo;
    double marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.rollNo = 1;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Rutuja";
        s2.rollNo = 2;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "Aditya";
        s3.rollNo = 3;
        s3.marks = 88;

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
