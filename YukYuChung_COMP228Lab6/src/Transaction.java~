import java.util.concurrent.TimeUnit;

public class Transaction implements Runnable{
    private final Account account;
    private final boolean isDeposit;
    private final double amount;

    // Constructor to initialize the transaction details
    public Transaction(Account account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("Executing transaction: " + Thread.currentThread().getName());

            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }

            // Simulate processing time (similar to the provided example)
            Long duration = (long) (Math.random() * 10);
            TimeUnit.SECONDS.sleep(duration);

            long endTime = System.currentTimeMillis();
            System.out.println("Total Execution Time for transaction " + Thread.currentThread().getName() + ": "
                    + (endTime - startTime) + " ms");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

