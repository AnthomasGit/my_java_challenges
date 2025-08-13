import java.sql.SQLOutput;
import java.util.EnumSet;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void printArrayInStars(int[] list) {
        for (int j : list) {
            for (int star = j; 0 < star; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = {5,1,3,4,2};

        printArrayInStars(nums);

    }
}