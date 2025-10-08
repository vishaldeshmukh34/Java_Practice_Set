// Q9. Create a class Teacher with variables name, subject, and experience.
class Teacher {
    String name;
    String subject;
    int experience;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Mr. Patil";
        t1.subject = "Java";
        t1.experience = 5;

        Teacher t2 = new Teacher();
        t2.name = "Mrs. Deshmukh";
        t2.subject = "Python";
        t2.experience = 4;

        t1.displayInfo();
        t2.displayInfo();
    }
}
