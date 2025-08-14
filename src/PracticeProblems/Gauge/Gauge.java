package PracticeProblems.Gauge;

public class Gauge {
    //Instance Variable
    private int value;
    //Default Constructor sets value = 0

    //Methods

    //increase value by 1
    public void increase() {
        this.value++ ;
    }

    //decreases value by 1
    public void decrease() {
        this.value--;
    }

    //returns value
    public int value() {
        return this.value;
    }

    //returns true if value == 5
    public boolean full() {
        return this.value == 5;
    }
}
