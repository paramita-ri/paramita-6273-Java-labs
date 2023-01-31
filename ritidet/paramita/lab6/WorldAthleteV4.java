/**
 * This WorldAthleteV4 program is program that has main medthod to run program. In main medthod
 * have two new objects akane and ratchanok by class BadmintonPlayerV3 and have medthod setWorldRanking()
 * and setSpeed() to set speed and WorldRanking in objects akane and ratchanok.
 * Have ArrayList<BadmintonPlayerV3> badmintonPlayers to get akane and ratchanok and has for-loop
 * to display data in objects akane and ratchanok
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 31 Janruary 2023
 */
package ritidet.paramita.lab6;

import ritidet.paramita.lab5.Athlete;
import java.util.*;

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane =
            new BadmintonPlayerV3("Akane Yamaguchi", 55, 1.68, 
                Athlete.Gender.FEMALE, "Japan", "05/02/1997");
        BadmintonPlayerV3 ratchanok = 
            new BadmintonPlayerV3("Ratchanok Intanon", 55, 1.68, 
                Athlete.Gender.FEMALE, "Thailand", "05/02/1997");
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for (BadmintonPlayerV3 badmintonPlayer : badmintonPlayers){
            System.out.println(badmintonPlayer);
        }
    }
}