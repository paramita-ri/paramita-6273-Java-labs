package ritidet.paramita.lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality +
                ", " + birthdate + ", " + sport + ", " + division + ", " + golveSize;
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
