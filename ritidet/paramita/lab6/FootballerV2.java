package ritidet.paramita.lab6;

class FootballerV2 extends AthleteV2{
    FootballerV2(String name, double weight, double height,Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }
    void practice(){
        super.practice();
        System.out.println("and catches a football.");
    }
}
