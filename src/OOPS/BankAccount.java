package OOPS;

public class BankAccount {
    int accountNo;
    String name;
    double balance;

    BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Nikhil", 5000);
        acc.withdraw(6000);
        acc.deposit(2000);
        acc.checkBalance();
    }
}
