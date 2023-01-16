package ritidet.paramita.lab6;

import java.util.ArrayList;

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("RatChanok Intanon", 55, 1.68, AthleteV2.Gender.FEMALE,
                "thai", "05/02/1995");
        FootballerV2 wisaksil = new FootballerV2("Wisaksil Wangek", 51.5, 1.60, AthleteV2.Gender.MALE,
                "thai", "08/12/1986");
        BoxerV2 tom = new BoxerV2("Tom Brady", 102, 1.93, AthleteV2.Gender.MALE,
                "American", "03/08/1977");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes) {
            System.out.println(athlete);
            athlete.practice();
        }
    }

}
