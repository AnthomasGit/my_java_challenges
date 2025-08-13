package PracticeProblems.MyFirstAccount;

public class Account {
    // Instance variables to store the account's name and balance.
    private String name;
    private double balance;

    /**
     * Constructor for the Account class.
     * Initializes a new account with a given name and initial balance.
     * @param name The name of the account.
     * @param balance The initial balance of the account.
     */
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Deposits a specified amount into the account.
     * @param amount The amount to deposit. Must be positive.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    /**
     * Withdraws a specified amount from the account.
     * The balance cannot go below zero.
     * @param amount The amount to withdraw. Must be positive.
     */
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    /**
     * Returns the current balance of the account.
     * @return The current balance.
     */
    public double balance() {
        return this.balance;
    }

    /**
     * Returns a string representation of the account,
     * showing the name and the current balance.
     * @return A string in the format "name: balance".
     */
    @Override
    public String toString() {
        return this.name + ": " + this.balance;
    }
}

