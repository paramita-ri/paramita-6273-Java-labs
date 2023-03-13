/**
 * This AthleteV2 program is extends from the package <lastname>.<firstname>.lab5.Athlete   
 * that has method practice() is the method will display 
 * "<name> run for 10 km" 
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 16 Janruary 2023
 */
package ritidet.paramita.lab6;

public class AthleteV2 extends ritidet.paramita.lab5.Athlete{
    public AthleteV2(String name, double weight, double height,Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    protected void practice(){
        System.out.print(name + " run for 10 km ");
    } 
}