/**
 * This Athlete class is the class that have protected instance variables to record the following 
 * information: name, weight, height, gender, nationality, birthdate and have enum called Gender 
 * that contains two values: MALE and FEMALE to be used as a value of the variable gender.
 * about Methods in Ahlete class ,This class have public setter and getter methods for each 
 * instance attribute of an athlete ,method toString() to display the information of an athlete
 * Its output format of method toString is
 * "Athlete [<name>, <weight> kg, <height> m, <gender>, <nationality>, <birthdate>] "
 * method compareAge() that accepts another athlete then compares the age of an instance 
 * athlete to that of the other athlete input as a parameter
 * Its output format of method compareAge() is
 * “athleteB is <number of years that are different> older than athleteA” 
 * If athleteB is older than athleteA   
 * “athleteB is <number of years that are different> younger than athleteA” 
 * If athleteB is younger than athleteA
 * “athleteA is as old as athleteB”
 * If athleteA has the same age as athleteB
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 16, 2022
 */

package ritidet.paramita.lab5;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Athlete implements Serializable {//fix becuase order in lab11
    public enum Gender {
        FEMALE,
        MALE
    };

    protected String name, nationality;
    protected double weight, height;
    protected Gender gender;
    protected LocalDate birthdate;
    //final protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //fix becuase order in lab11
    protected ArrayList<String> toString = new ArrayList<String>();

    protected Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//fix becuase order in lab11
        this.birthdate = LocalDate.parse(birthdate, formatter);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setBirthDate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getBirthDate() {
        return birthdate;
    }

    public String toString() {
        return "Athlete [ " + name + " , " + weight  + " kg, " + height + " m, " + gender + " ," + nationality + " ," + birthdate.toString() + " ]"; 
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