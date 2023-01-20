/**
 * This Footballer class is subclass of class Athlete that have one static variables 
 * to record sport "American Football" and two private variables racketLength and worldRanking to 
 * record racketLength and worldRanking
 * about Methods in Footballer class ,This class have setter and getter methods for each 
 * instance attribute of an Footballer ,method toString() to display the information of an Footballer
 * Its output format of method toString is
 * "<name>, <weight> kg, <height> m, <gender>, <nationality>, <birthdate>, <sport>, 
 * <position>, <team>"
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 16, 2022
 * 
 */
package ritidet.paramita.lab5;

class Footballer extends Athlete {

    Footballer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, String position, String team) {
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position;
        this.team = team;
    }

    private static String sport = "American Football";
    private String position;
    private String team;

    static String getSport() {
        return sport;
    }

    String getPosition() {
        return position;
    }

    String getTeam() {
        return team;
    }

    void setPosition(String position) {
        this.position = position;
    }

    void setTeam(String team) {
        this.team = team;
    }

    public String toString() {
        super.toString();
        toString.add(position);
        toString.add(team);
        return toString.toString().replace("[", "")
                .replace("]", "");
    }
}
