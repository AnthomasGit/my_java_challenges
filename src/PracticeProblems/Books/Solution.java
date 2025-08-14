package PracticeProblems.Books;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.print("Title:");
            String titleHolder = reader.nextLine();
            if (titleHolder.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            String pageHolder = reader.nextLine();
            if (pageHolder == null) {
                break;
            }
            System.out.print("Publication year: ");
            String yearHolder = reader.nextLine();
            if (yearHolder == null) {
                break;
            }
            books.add(new Book(titleHolder, Integer.valueOf(pageHolder), Integer.valueOf(yearHolder)));
        }

        System.out.print("What information will be printed?");
        String input = reader.nextLine();
        if (input.equals("everything")) {
            for (Book bookInfo : books) {
                System.out.println(bookInfo);
            }
        } else if (input.equals("name")) {
            for (Book bookInfo : books) {
                System.out.println(bookInfo.getTitle());
            }
        }
    }
}
