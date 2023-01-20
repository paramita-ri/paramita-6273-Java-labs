/**
 * This WorldAthleteV2 program is program has the main method that crete new object
 * ratchanok, tom, wisaksil, nitchaon by using class BadmintonPlayer, Footballer, Boxer
 * and using method compareAge() from class Ahtlete ,isTaller() from this program
 * Its output format of compareAge() is
 * "<AthleteB> is <year> older/younger than <AthleteA>
 * or <AthleteA> is as old as <AthleteB>" 
 * Its output of isTaller() is
 * true if height of athleteA > height of athleteB
 * false if height of athleteA < height of athleteB
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 16, 2022
 */
package ritidet.paramita.lab5;

public class WorldAthleteV2 {
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("RatChanok Intanon", 55, 1.68, Athlete.Gender.FEMALE,
                "thai", "05/02/1995", 66.5, 4);
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Athlete.Gender.MALE,
                "American", "03/08/1977", "Quarterback", "New England Patriots");
        Boxer wisaksil = new Boxer("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE,
                "thai", "08/12/1986", "Super Flyweight", "M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol", 52, 1.63, Athlete.Gender.FEMALE,
                "Thai", "31/03/1998", 67, 11);
        System.out.println("Both " + ratchanok.getName() + " and " + nitchaon.getName() +
                " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);

        if (isTaller(wisaksil, tom)) {
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(tom.getName() + " is taller than " + wisaksil.getName());
        }

    }

    static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        if (athleteA.height > athleteB.height) {
            return true;
        } else {
            return false;
        }
    }

}
