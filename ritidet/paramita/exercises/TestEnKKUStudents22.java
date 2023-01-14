package ritidet.paramita.exercises;

import java.util.*;

public class TestEnKKUStudents22 {
    public static void main(String[] args) {
        ArrayList<EnKKUStudent22> student =new ArrayList<EnKKUStudent22>();
        student.add(new COEStudent22());
        student.add(new DMEStudent22());
        int numStudents = student.size();
        for (int i = 0; i < numStudents; i++){
            student.get(i).register();
        }
    }
}
