// ParameterizedConstructorDemo.java

class Student {
    int roll;
    String name;

    // Parameterized constructor
    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vishal");
        Student s2 = new Student(2, "Rohit");

        s1.display();
        s2.display();
    }
}
