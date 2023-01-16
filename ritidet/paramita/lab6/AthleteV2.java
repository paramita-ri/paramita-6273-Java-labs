package ritidet.paramita.lab6;


public class AthleteV2 extends ritidet.paramita.lab5.Athlete{

    AthleteV2(String name, double weight, double height,Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    void practice(){
        System.out.print(name + " run for 10 km ");
    } 
}



