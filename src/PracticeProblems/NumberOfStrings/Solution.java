package PracticeProblems.NumberOfStrings;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = reader.nextLine();

            if (input.equals("end")) {
                break;
            } else {
                inputs.add(input);
            }
        }
        System.out.println(inputs.size());
    }
}
