// 3️⃣ Program to deposit and withdraw money using a global variable

public class BankAccount {
    double balance;

    void deposit(double amount) { balance += amount; }

    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.balance);
    }
}
