/**
 * This Boxer class is subclass of class Athlete that have one static variables 
 * to record sport "badminton" and two private variables racketLength and worldRanking to 
 * record racketLength and worldRanking
 * about Methods in Boxer class ,This class have setter and getter methods for each 
 * instance attribute of an Boxer ,method toString() to display the information of an Boxer
 * Its output format of method toString is
 * "<name>, <weight> kg, <height> m, <gender>, <nationality>, <birthdate>, <sport>,
 * <division>, <golveSize>"
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 16, 2022
 * 
 */
package ritidet.paramita.lab5;

class Boxer extends Athlete {

    Boxer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, String division, String golveSize) {
        super(name, weight, height, gender, nationality, birthdate);
        this.division = division;
        this.golveSize = golveSize;
    }

    static String sport = "Boxer";
    private String division;
    private String golveSize;

    static String getSport() {
        return sport;
    }

    String getDivision() {
        return division;
    }

    String getGolveSize() {
        return golveSize;
    }

    void setDivision(String division) {
        this.division = division;
    }

    void setGolveSize(String golveSize) {
        this.golveSize = golveSize;
    }

    public String toString() {
        super.toString();
        toString.add(division);
        toString.add(golveSize);
        return toString.toString().replace("[", "")
                .replace("]", "");
    }
}
