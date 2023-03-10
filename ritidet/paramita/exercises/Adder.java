package ritidet.paramita.exercises;

public class Adder {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two arguments");
        } else {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
            } catch (NumberFormatException e) {
                System.out.println("Please provide two integer");
            } catch (Exception e) {
                System.out.println("Please provide two integer");
            }
        }
    }
}