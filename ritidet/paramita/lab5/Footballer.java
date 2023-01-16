package ritidet.paramita.lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
        return name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality +
                ", " + birthdate + ", " + sport + ", " + position + ", " + team;
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
