public class BankAccount {
    private double balance;

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) { if(amount > 0) balance += amount; }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance or invalid amount!");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(600); // invalid
    }
}
