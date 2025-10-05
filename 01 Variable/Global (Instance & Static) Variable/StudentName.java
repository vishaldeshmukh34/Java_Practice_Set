// 1️⃣ Create a class Student with a global variable name. 
// Write a method to set the name and another to print it.

public class StudentName {
    String name; // global (instance) variable

    public void setName(String newName) {
        name = newName;
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        StudentName s1 = new StudentName();
        s1.setName("Roshani");
        s1.printName();
    }
}
