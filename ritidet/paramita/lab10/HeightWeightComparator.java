/*
 * This HeightWeightComparator program is the program that imimplements Comparator<AthleteV2>
 * and has overide methods compare().
 * This is the program for compare between height and weight of two Ahtlete
 * by follow:
 * If the athlete1’s height is less than athlete2’s height, then the method returns -1  
 * If the athlete1’s height is equal to athlete2’s height, then compares athletes’ weight
 * If the athlete1’s weight is less than athlete2’s weight, then returns -1
 * If the athlete1’s weight is equal to athlete2’s weight, then the method returns 0
 * If the athlete1’s weight is greater than athlete2’s weight then the method returns 1
 * If the athlete1’s height is greater than athlete’s height then the method returns 1
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 March 2023
 */
package ritidet.paramita.lab10;

import ritidet.paramita.lab6.AthleteV2;
import java.util.Comparator;

public class HeightWeightComparator implements Comparator<AthleteV2> {
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        if (Double.compare(athlete1.getHeight(), athlete2.getHeight()) == 0) {
            return Double.compare(athlete1.getWeight(), athlete2.getWeight());
        } else {
            return Double.compare(athlete1.getHeight(), athlete2.getHeight());
        }
    }
}