class Account {
    private double balance;

    public Account() {
        balance = 100.00;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        // account 1
        Account acc1 = new Account(876.76);
        acc1.deposit(345.87);
        acc1.withdraw(123.45);
        System.out.println("Current Balance of account 1: $" + acc1.getBalance());

        // account 2
        Account acc2 = new Account(acc1.getBalance());
        acc2.deposit(987.65);
        acc2.withdraw(543.21);
        System.out.println("Current Balance of account 2: $" + acc2.getBalance());

    }
}
