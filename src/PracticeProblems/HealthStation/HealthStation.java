package PracticeProblems.HealthStation;

public class HealthStation {
    private int count;

    //Default Contructor

    public int weigh(Person person) {
        this.count++ ;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.increaseWeight() ;
    }

    public int weighings() {
        return this.count;
    }





}
