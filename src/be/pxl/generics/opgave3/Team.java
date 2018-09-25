package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    private int played;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private List<T> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
            opponentTeam.lost++;
        }else if (ourScore < theirScore){
            opponentTeam.won++;
            lost++;
        }else {
            opponentTeam.tied++;
            tied++;
        }

        played++;
        opponentTeam.played++;
    }

    public int ranking(){
        return (won * 3) + tied;
    }

    public void addPlayer(T player) {
        if (!players.contains(player)){
            players.add(player);
        }
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getTied() {
        return tied;
    }

    public void setTied(int tied) {
        this.tied = tied;
    }

    public List<T> getPlayers() {
        return players;
    }

    public void setPlayers(List<T> players) {
        this.players = players;
    }
}
