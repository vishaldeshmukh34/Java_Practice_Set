public class Main {
    public static void main(String[] args) {

        System.out.println("===== PERSON =====");
        Person p = new Person();
        p.setName("Vishal");
        p.setAge(25);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        System.out.println("\n===== BANK ACCOUNT =====");
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(600);

        System.out.println("\n===== STUDENT =====");
        Student s = new Student();
        s.setRollNo(101);
        s.setMarks(89.5);
        s.displayDetails();

        System.out.println("\n===== EMPLOYEE =====");
        Employee e = new Employee();
        e.setId(1);
        e.setName("Ramesh");
        e.setSalary(50000);
        e.setSalary(-200); // invalid
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());

        System.out.println("\n===== CAR =====");
        Car car = new Car();
        car.setSpeed(150);
        car.setSpeed(250); // invalid
        System.out.println("Speed: " + car.getSpeed());

        System.out.println("\n===== BOOK =====");
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("Herbert Schildt");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());

        System.out.println("\n===== RECTANGLE =====");
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        System.out.println("Area: " + r.calculateArea());

        System.out.println("\n===== CIRCLE =====");
        Circle c = new Circle();
        c.setRadius(7);
        c.setRadius(-3); // invalid
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Circumference: " + c.calculateCircumference());
    }
}
