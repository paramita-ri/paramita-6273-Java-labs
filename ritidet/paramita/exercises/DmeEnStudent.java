package ritidet.paramita.exercises;

public class DmeEnStudent extends Student {

    String name;

    public DmeEnStudent(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void writeProgram() {
        System.out.println(name + "writes programs in Python and C#");
    }

}
