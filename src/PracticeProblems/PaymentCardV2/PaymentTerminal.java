package PracticeProblems.PaymentCardV2;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
        this.money += 2.50;
        this.affordableMeals++;
        return (payment - 2.50);
        } else {
            System.out.println("Insufficient Funds");
            return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }
    }

    public double eatHeartily(double payment) {
         if (payment >= 4.30) {
         this.money += 4.30;
         this.heartyMeals++;
         return (payment - 4.30);
         } else {
             System.out.println("Insufficient Funds");
             return payment;
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.50)) {
            this.affordableMeals++ ;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.30)) {
            this.heartyMeals++ ;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
