// Q3. Create a class Employee with variables empId, empName, and salary.
class Employee {
    int empId;
    String empName;
    double salary;

    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    void increaseSalary(double amount) {
        salary += amount;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Vishal";
        e1.salary = 25000;

        Employee e2 = new Employee();
        e2.empId = 102;
        e2.empName = "Rutuja";
        e2.salary = 30000;

        e1.increaseSalary(5000);
        e2.increaseSalary(3000);

        e1.showDetails();
        e2.showDetails();
    }
}
