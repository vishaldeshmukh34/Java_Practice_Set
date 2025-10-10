public class Student {

    String name;
    int age;

    // Constructor with parameters
    public Student(String name, int age) {
        // 'this' keyword refers to the current object's variables
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Create object using parameterized constructor
        Student s1 = new Student("Vishal", 21);
        s1.showDetails();
    }
}

