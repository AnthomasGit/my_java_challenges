package PracticeProblems.MyFirstAccount;

public class SolutionMyFirstAccount {

    public static void main(String[] args) {
        Account anthomasAccount = new Account("Anthomas's account", 100.0);

        anthomasAccount.deposit(20.0);

        System.out.println("Your account balance is: " + anthomasAccount.balance());

        System.out.println(anthomasAccount);
    }
}
