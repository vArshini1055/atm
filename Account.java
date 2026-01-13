import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<String> transactions;

    public Account() {
        balance = 10000;
        transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            return true;
        }
        return false;
    }

    public boolean transfer(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add("Transferred: " + amount);
            return true;
        }
        return false;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }
}
