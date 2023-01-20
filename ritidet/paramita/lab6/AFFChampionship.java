package ritidet.paramita.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition{

    String teamA,teamB;
    ArrayList<String> toString = new ArrayList<String>();
    ArrayList<String> places = new ArrayList<String>();
    ArrayList<String> sponsor = new ArrayList<String>();


    AFFChampionship(String name, String teamA, String teamB) {
        super.name = name;
        this.teamA = teamA;
        this.teamB = teamB;
    }
    public String getTeamA() {
        return teamA;
    }
    public String getTeamB() {
        return teamB;
    }
    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }
    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public String toString() {
        toString.add(teamA);
        toString.add(teamB);
        return name + " in the final round was the game between " + teamA + " vs. " + teamB;
    }

    void setPlace(ArrayList<String> places){
        this.places = places;
        System.out.println(name + " plays at these stadiums\n" + places);
    }
    void setDescription() {
        
    }
    void setSponsorship(ArrayList<String> sponsor) {
        this.sponsor = sponsor;
        if(sponsor.size() == 1){
            System.out.println(sponsor.toString().replace("[", "")
            .replace("]", "") + " is a sponsor of " + name);
        }
        else{
            System.out.println( "Sponsors of " + name + " are " + sponsor);
        }
        
    }
    
}
