class Account {
    public double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance, double bonus) {
        balance = initialBalance + bonus;
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

    public void display() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.display();

        System.out.println();

        Account acc2 = new Account(1000, 50);
        acc2.withdraw(300);
        acc2.display();
    }
}