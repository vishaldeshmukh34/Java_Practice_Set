// 2️⃣ Write a program with a static global variable count that keeps track of how many objects of a class are created.

public class StudentCount {
    static int count = 0; // static variable shared by all objects

    StudentCount() {
        count++;
    }

    public void printCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        StudentCount s1 = new StudentCount();
        StudentCount s2 = new StudentCount();
        StudentCount s3 = new StudentCount();
        s3.printCount();
    }
}
