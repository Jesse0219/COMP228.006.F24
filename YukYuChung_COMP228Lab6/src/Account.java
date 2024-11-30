public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s deposited %.2f. New balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    // Synchronized withdraw method
    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew %.2f. New balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        } else {
            System.out.printf("%s tried to withdraw %.2f but insufficient balance. Current balance: %.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    // Getter to check current balance
    public double getBalance() {
        return balance;
    }
}

