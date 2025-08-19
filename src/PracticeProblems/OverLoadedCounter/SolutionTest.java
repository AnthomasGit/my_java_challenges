package PracticeProblems.OverLoadedCounter;

public class SolutionTest {

    public static void main(String[] args) {

        Counter myCount = new Counter();

        Counter secondCount = new Counter(28);

        System.out.println(myCount.value());
        System.out.println(secondCount.value());

        secondCount.increase();
        myCount.increase(100);

        System.out.println(myCount.value());
        System.out.println(secondCount.value());

        secondCount.decrease(35);
        myCount.decrease();

        System.out.println(myCount.value());
        System.out.println(secondCount.value());
    }

}
