package be.pxl.generics.opgave3;

public class TeamApp {
    public static void main(String[] args) {
        Team<SoccerPlayer> team = new Team<>("De Losers");
        team.addPlayer(new SoccerPlayer("Wouter"));
        //team.addPlayer(new VolleybalPlayer("Ian"));

        team.matchResult(new Team<>(""), 5, 3);
    }
}
