package ritidet.paramita.lab5;

public class WorldAthlete {
    public static void main(String[] args) {
        Athlete ratchanok = new Athlete("RatChanok Intanon", 55, 1.68, Athlete.Gender.FEMALE,
                "thai", "05/02/1995");
        Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE,
                "thai", "08/12/1986");
        Athlete tom = new Athlete("Tom Brady", 102, 1.93, Athlete.Gender.MALE,
                "American", "03/08/1977");
        System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHeight());
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to " +
                ratchanok.getHeight());
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);

    }
}
