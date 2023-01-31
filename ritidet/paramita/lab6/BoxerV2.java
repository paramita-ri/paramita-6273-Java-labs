/**
 * This BadmintonPlayerV2 program is subclass of AthleteV2 that has one method is
 * practice() the medthod that override from medthod practice() in AthleteV2.
 * This practice() will display as:
 * "<name> run for 10 km and swings arms."
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 16 Janruary 2023
 */
package ritidet.paramita.lab6;

class BoxerV2 extends AthleteV2 {
    BoxerV2(String name, double weight, double height,Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    
    protected void practice(){
        super.practice();
        System.out.println("and swings arms.");
    }
}