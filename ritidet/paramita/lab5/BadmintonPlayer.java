/**
 * This BadmintonPlayer class is subclass of class Athlete that have one static variables 
 * to record sport "badminton" and two private variables racketLength and worldRanking to 
 * record racketLength and worldRanking
 * about Methods in BadmintonPlayer class ,This class have setter and getter methods for each 
 * instance attribute of an BadmintonPlayer ,method toString() to display the information of an BadmintonPlayer
 * Its output format of method toString is
 * "<name>, <weight> kg, <height> m, <gender>, <nationality>, <birthdate>, <sport>,
 * <racketLength> cm, Rank: <worldRanking>"
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 16, 2022
 * 
 */
package ritidet.paramita.lab5;

class BadmintonPlayer extends Athlete {

    BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, double racketLength, int worldRanking) {
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
    }

    static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    static String getSport() {
        return sport;
    }

    double getRacketLength() {
        return racketLength;
    }

    int getWorldRanking() {
        return worldRanking;
    }

    void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }

    void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    public String toString() {
        super.toString();
        toString.add(sport);
        toString.add(racketLength + "cm");
        toString.add("Rank: " + worldRanking);
        return toString.toString().replace("[", "")
                .replace("]", "");
    }
}
