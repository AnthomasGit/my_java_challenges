package PracticeProblems.Statistics;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0 ;
        this.sum = 0 ;
    }

    //Setters

    public void addNumber(int num) {
        this.count++ ;
        this.sum += num;
    }

    //Getters

    public int getCount() {
        return this.count ;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return sum()/ (double) getCount() ;
    }
}

