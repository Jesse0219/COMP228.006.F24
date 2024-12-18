import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an account with an initial balance
        Account sharedAccount = new Account(1000.00);

        // Step 2: Create a list of Transaction objects
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Adding transactions: Some deposits and some withdrawals
        transactions.add(new Transaction(sharedAccount, true, 200.00));  // Deposit
        transactions.add(new Transaction(sharedAccount, false, 150.00)); // Withdraw
        transactions.add(new Transaction(sharedAccount, true, 350.00));  // Deposit
        transactions.add(new Transaction(sharedAccount, false, 500.00)); // Withdraw
        transactions.add(new Transaction(sharedAccount, false, 1000.00)); // Withdraw (Insufficient balance)

        // Step 3: Create an ExecutorService to execute threads
        ExecutorService executor = Executors.newFixedThreadPool(3);  // Pool of 3 threads

        // Step 4: Execute all transactions using the executor service
        for (Transaction transaction : transactions) {
            executor.execute((Runnable) transaction);
        }

        // Step 5: Shut down the executor service after all tasks have been executed
        executor.shutdown();
    }
}