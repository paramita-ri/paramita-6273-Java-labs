/**
 * This AFFChampionship program is subclass of Competition that have two String variables: 
 * teamA, teamB with getter, setter medthod for these two protected variables and 
 * three ArrayList<String>: toString, places, sponsor.Other method in this program is 
 * medthod toString() that will display as follows:
 * "<name> in the final round was the game between <teamA> vs. <teamB>."
 * medthod setPlace() to set variable places and display as follows:
 * "<name> plays at these stadiums
 * <places>"
 * medthod setSponsorship() to set variable ArrayList<String> sponsor and display as follows:
 * "<sponsor> is a sponsor of name " if has one sponsor.
 * and "Sponsors of <name> are [sponsor]" if have many sponsor.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 20 Janruary 2023
 */
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
        return name + " in the final round was the game between " + teamA + " vs. " + teamB + ".";
    }

    void setPlace(ArrayList<String> places){
        this.places = places;
        System.out.println(name + " plays at these stadiums\n" + places);
    }

    protected void setDescription() {
        
    }

    protected void setSponsorship(ArrayList<String> sponsor) {
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
