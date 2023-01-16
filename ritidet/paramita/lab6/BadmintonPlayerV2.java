package ritidet.paramita.lab6;

public class BadmintonPlayerV2 extends AthleteV2 {

    BadmintonPlayerV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    void practice() {
        super.practice();
        System.out.println("and plays half court singles");
    }
}
