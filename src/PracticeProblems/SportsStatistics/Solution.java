package PracticeProblems.SportsStatistics;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void getStatistics(String file) {
        ArrayList<Match> lines = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        try (Scanner scanner = new Scanner(Paths.get("src/PracticeProblems/SportsStatistics/" + file))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);

                lines.add(new Match(homeTeam,visitTeam,homePoints,visitPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String team = reader.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;

        for (Match match : lines) {
            if (match.homeTeam.equals(team)) {
                count++;
                if (match.homeTeamPoints > match.vTeamPoints) {
                    wins++;
                }else {
                    losses++;
                }
            } else if (match.visitingTeam.equals(team)) {
                count++;
                if (match.homeTeamPoints < match.vTeamPoints) {
                    wins++;
                }else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("File:");
        String file = reader.nextLine();

        getStatistics(file);
    }
}
