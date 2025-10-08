// Q4. Create a class BankAccount with variables accountNumber, holderName, and balance.
class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 1001;
        acc.holderName = "Vishal";
        acc.balance = 5000;

        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("Final Balance: " + acc.balance);
    }
}
