/*
 * This NameComparator program is the program that imimplements Comparator<AthleteV2>
 * and has overide methods compare().
 * This is the program for compare between name of two Ahtlete
 * by follow:
 * If the athlete1’s name is less than athlete2’s name, then the method returns -1  
 * If the athlete1’s name is equal to athlete2’s name, then the method returns 0
 * If the athlete1’s name is greater than athlete’s name then the method returns 1
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 13 March 2023
 */
package ritidet.paramita.lab10;

import ritidet.paramita.lab6.AthleteV2;
import java.util.Comparator;

public class NameComparator implements Comparator<AthleteV2> {

    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        return athlete1.getName().compareTo(athlete2.getName());
    }
}