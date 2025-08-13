package PracticeProblems.PrintArrayInStars;

import java.util.Scanner;

public class Solution {

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