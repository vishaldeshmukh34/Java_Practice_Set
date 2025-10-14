// NoArgumentConstructorDemo.java

class Student {
    int roll;
    String name;

    // No-argument constructor
    Student() {
        roll = 10;
        name = "Vishal";
        System.out.println("No-Argument Constructor called");
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }
}

public class NoArgumentConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();  // Calls no-arg constructor
        s1.display();
    }
}
