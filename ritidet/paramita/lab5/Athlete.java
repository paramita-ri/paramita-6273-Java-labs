package ritidet.paramita.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Athlete {
    public enum Gender {
        FEMALE,
        MALE
    };

    protected String name, nationality;
    protected double weight, height;
    protected Gender gender;
    protected LocalDate birthdate;
    final protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    ArrayList<String> toString = new ArrayList<String>();

    protected Athlete(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
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
        toString.add(name);
        toString.add(weight + "kg");
        toString.add(height + "m");
        toString.add(gender.toString());
        toString.add(nationality);
        toString.add(birthdate.toString());
        return "Athlete [" + name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality +
                ", " + birthdate + "]";
    }

}
