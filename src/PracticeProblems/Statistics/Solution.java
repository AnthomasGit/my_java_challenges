package PracticeProblems.Statistics;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //Create 3 objects to track
        Statistics user = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: (exit with -1)");

        int input = reader.nextInt();

        //Takes input, exits with -1
        while(input != -1) {

            user.addNumber(input);
            //Add to even if the number is even
            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
            //Add to odd object
                odd.addNumber(input);
            }

            input = reader.nextInt();
        }

        //Prints out objects
        System.out.println("Sum: " + user.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
