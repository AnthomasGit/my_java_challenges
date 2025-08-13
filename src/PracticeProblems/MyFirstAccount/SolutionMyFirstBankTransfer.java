package PracticeProblems.MyFirstAccount;

public class SolutionMyFirstBankTransfer {
    public static void main(String[] args) {

        Account Mathewsaccount = new Account("Mathews account", 1000);

        Account Myaccount = new Account ("My account", 0);

        Mathewsaccount.withdraw(100);

        Myaccount.deposit(100);

        System.out.println(Mathewsaccount);
        System.out.println(Myaccount);
    }
}
