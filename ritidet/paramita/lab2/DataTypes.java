/**
* This DataTypes program is written to use variables with different datatypes 
* to get the name, student id, boolean.
* Its output format is 
* “My name is <name>.  
* My student ID was <studentID>
* <first letter of firstname> true <last two digit of ID> <last two digit of ID>
* <last two digit of ID> <last two digitID point first two digitID> <last two digitID point first two digitID> ” 
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 9, 2022
*
**/
package ritidet.paramita.lab2;

public class DataTypes {
    public static void main(String[] args) {
        String my_name = "Paramita ritidet" ;
        String my_studentID = "6530406273" ;
        Character first_Letter_Of_FirstName = (my_name.charAt(0)) ;
        boolean valueOfBoolean = true ;
        int myID_in_Octal = 0111 ;
        int myID_in_Hexadecimal = 0x49 ;
        long lastTwoDigits_Of_ID = 73 ;
        float lastTwoDigitsID_point_FirstTwoDigitsID = (float) 73.65 ;
        Double lastTwoDigitsID_point_LastTwoDigitsCurrentYear = 73.22 ;
        System.out.println("My name is " + my_name);
        System.out.println("My student ID was " + my_studentID);
        System.out.println(first_Letter_Of_FirstName + " " + valueOfBoolean + " " + myID_in_Octal + " " + myID_in_Hexadecimal );
        System.out.println(lastTwoDigits_Of_ID + " " + lastTwoDigitsID_point_FirstTwoDigitsID + " " + lastTwoDigitsID_point_LastTwoDigitsCurrentYear);
    }
}
