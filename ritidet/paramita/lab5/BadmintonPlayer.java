package ritidet.paramita.lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        toString.add(racketLength + "cm");
        toString.add("Rank: " + worldRanking);
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality +
                ", " + birthdate + ", " + sport + ", " + racketLength + "cm, Rank:" + worldRanking
                + " equipment:shuttlecock";
    }

    void compareAge(Athlete athleteB) {
        LocalDate dateBefore = birthdate;
        LocalDate dateAefore = athleteB.birthdate;
        int year = (int) ChronoUnit.YEARS.between(dateBefore, dateAefore);
        if (year < 0) {
            System.out.println(athleteB.getName() + " is " + Math.abs(year) + " older than " + getName());
        } else if (year == 0) {
            System.out.println(getName() + " is as old as " + athleteB.getName());
        } else {
            System.out.println(athleteB.getName() + " is " + year + " younger than " + getName());
        }
    }
}
