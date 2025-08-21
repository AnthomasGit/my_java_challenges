package PracticeProblems.PaymentCardV2;

public class PaymentCard {
    private double balance;

    public PaymentCard(double initBalance) {
        this.balance = initBalance;
    }

    public PaymentCard() {
        this(0);
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
        

}
