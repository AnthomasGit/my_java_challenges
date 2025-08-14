package PracticeProblems.PaymentCard;

public class PaymentCard {
    private double balance;

    //Constructor
    public PaymentCard(double initBalance) {
        this.balance = initBalance;
    }

    //Setters
    public void addMoney(double amount) {
        if (amount <= 0) {
            return;
        }
        if ((this.balance + amount) > 150) {
            this.balance = 150;
            return;
        }
        this.balance += amount;
    }

    public void eatAffordably() {
        if ((this.balance - 2.60) < 0) {
            return;
        }
        this.balance -= 2.60;

    }

    public void eatHeartily() {
        if ((this.balance - 4.60) < 0) {
            return;
        }
        this.balance -= 4.60;

    }




    //Getters
    public String toString() {
        return "The card has a balance of " + this.balance + " dollars";
    }
}
