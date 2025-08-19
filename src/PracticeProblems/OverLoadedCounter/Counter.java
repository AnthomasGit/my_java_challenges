 package PracticeProblems.OverLoadedCounter;

public class Counter {
    int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0) ;
    }

    public int value() {
        return this.value;
    }

    public void decrease() {
        this.decrease(1) ;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }

    public void increase() {
        this.increase(1) ;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }
}
