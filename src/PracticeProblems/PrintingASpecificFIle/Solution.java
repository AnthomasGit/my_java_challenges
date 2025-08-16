package PracticeProblems.PrintingASpecificFIle;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Which file should have its content printed?");
        String file = reader.nextLine();

        try (Scanner scanner = new Scanner(Paths.get("src/PracticeProblems/PrintingASpecificFile/" + file))) {

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();

                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
