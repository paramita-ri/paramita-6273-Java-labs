package ritidet.paramita.exercises;

public class ComEnStudent extends Student {

    String name;

    public ComEnStudent(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void writeProgram() {
        System.out.println(name + " writes programs in Python and Java");
    }

}
