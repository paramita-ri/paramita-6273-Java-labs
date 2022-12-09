/**
* This StringAPI program is to accept one arguments: School Name
* And check that School have the word "university" or "college".
* if it have the word "university" 
* Its output format is 
* “<schoolName> + " is a University.” 
* if it have the word "college"  
* Its output format is 
* “< schoolName > is a  College.”
* if it haven't the word "university" or "college".
* Its output format is 
* "<schoolName> is neither a university nor a college"
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 9, 2022
*
**/
package ritidet.paramita.lab2;

public class StringAPI {
    public static void main(String[] args) {
        int length_of_args = args.length ;
        String schoolName = args[0] ; 
        if (length_of_args == 1){
            if (schoolName.contains("university") || schoolName.contains("University")) {
                System.out.println(schoolName + " is a university");
            }
            else if (schoolName.contains("college") || schoolName.contains("College")) {
                System.out.println(schoolName + " is a  college");
            }
            else {
            System.out.println(schoolName + " is neither a university nor a college");
            }
        }
        else{
            System.out.println("Usagse : StringSPI < School Name >");
        }
    }
}
