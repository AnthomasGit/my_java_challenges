package PracticeProblems.SportsStatistics;

public class Match {
    String homeTeam;
    String visitingTeam;
    int homeTeamPoints;
    int vTeamPoints;

    Match(String team1, String team2, int team1Points, int team2Points) {
        this.homeTeam = team1;
        this.visitingTeam = team2;
        this.homeTeamPoints = team1Points;
        this.vTeamPoints = team2Points;
    }
}
