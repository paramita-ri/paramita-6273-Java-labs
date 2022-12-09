/**
* This RecComputation program is to accept two arguments: wigth of rectangl
* and heigth of rectangle.then calculate circumference and area of rectangle.
* Its output format is 
* “The circumference of a rectangle with wigth = <width> and height = 
* <heigth> is <circumference> and its area is <area>"
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 2
* Date: December 9, 2022
*
**/
package ritidet.paramita.exercises;

public class RecComputation {
    public static void main(String[] args) {
        int length_of_args = args.length ;
        if (length_of_args == 2) {
            double width = Double.parseDouble(args[0]) ;
            double heigth = Double.parseDouble(args[1]) ; 
            double circumference = (2 * heigth) + (2 * width) ;
            double area = heigth * width ;
            System.out.println("The circumference of a rectangle with wigth = " + width + " and height = " + heigth + " is " + circumference + " and its area is " + area);
        }
        else{
            System.out.println("Usage: <wigth of rectangle> <heigth of rectangle>");
        }
    }
}
