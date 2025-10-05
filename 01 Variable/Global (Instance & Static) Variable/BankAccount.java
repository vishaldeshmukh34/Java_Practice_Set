// 3️⃣ Make a class with a global variable balance. 
// Create methods to deposit and withdraw money that update this variable.

public class BankAccount {
    double balance; // global variable

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.printBalance();
    }
}
