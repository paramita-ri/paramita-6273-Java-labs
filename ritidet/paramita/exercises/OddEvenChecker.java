/**
* This OddEvenChecker program is to accept one arguments: integer
* and check that integer is even or odd number.
* if integer is even
* Its output format is 
* “<integer> is even"
* if integer is even
* Its output format is 
* “<integer> is odd"
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 2
* Date: December 14, 2022
*
**/

package ritidet.paramita.exercises;

public class OddEvenChecker {
    public static void main(String[] args) {
        int length_args = args.length;
        if (length_args == 1) {
            int integer = Integer.parseInt(args[0]);
            if ((integer % 2) == 0) {
                System.out.println(integer + " is even");
            } else {
                System.out.println(integer + " is odd");
            }

        } else {
            System.out.println("Usage : OddEvenChecker <integer> ");
        }
    }
}