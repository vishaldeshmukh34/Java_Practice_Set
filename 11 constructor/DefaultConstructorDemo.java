// DefaultConstructorDemo.java

class Student {
    int roll;
    String name;
    // Default constructor - compiler automatically creates it
}

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();  // Default constructor called
        System.out.println("Roll No: " + s1.roll);   // default value = 0
        System.out.println("Name: " + s1.name);      // default value = null
    }
}
