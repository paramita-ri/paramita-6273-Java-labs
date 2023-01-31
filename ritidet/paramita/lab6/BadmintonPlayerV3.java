/**
 * This BadmintonPlayerV3 program is a subclass of BadmintonPlayerV2 and  
 * implements interface BadmintonPlayable and Sprinter.
 * Class BadmintonPlayerV3 has three protected attributes: racketLength, worldRanking, and speed
 * and has overrides the method toString() by having the same output as the Athlete object has 
 * and also has its own string as “<name> is a Badminton player whose world ranking is 
 * <worldRanking> and has sprint speed as <speed>”.
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Sprinter {
    protected int worldRanking;
    protected double speed, raketLength;

    BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public String toString(){
        return super.toString() + "\n" + name + " is a Badminton player whose world ranking is " + 
        worldRanking + " and has sprint speed as " + speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getRacketLength() {
        return raketLength;
    }

    public int getWorldRanking() {
        return worldRanking;
    }

    public void setSpeed(double speed) {
        this.speed = speed;  
    }

    public void setRacketLength(double raketLength) {
        this.raketLength = raketLength;    
    }

    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;    
    }
}
