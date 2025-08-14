package PracticeProblems.Debtcalculator;

public class Debt {

    //Instance Variables
    double balance;
    double interestRate;

    //Constructor
    public Debt(double initBalance, double initRate ) {
        this.balance = initBalance;
        this.interestRate = initRate;
    }

    //Methods
    public void printBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interestRate;
    }
}
