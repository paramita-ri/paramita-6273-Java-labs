package ritidet.paramita.exercises;


public class TestStudent {
    public static void main(String[] args) {
        final int NUM_STUDENT = 3;
        Student[] students = new Student[NUM_STUDENT];
        students[0] = new DmeEnStudent("Manee");
        students[1] = new ComEnStudent("Mana");
        students[2] = new ComEnStudent("Piti");
        for (int i = 0 ; i < NUM_STUDENT ; i++){
            students[i].writeProgram();
        }
    }
}
