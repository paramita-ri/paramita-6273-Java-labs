/**
 * This Footballer program is to accept three arguments: footballer name, the 
*  the nationality of the footballer, and the football club that the footballer plays.
*  Its output format is 
*  “My Favorite football player  is <athlete_name>.  
*  His nationality as <athlete_nationality>
*  He plays for <his football club>” 
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 9, 2022
*
**/

package ritidet.paramita.lab2;

public class Footballer {
    public static void main(String[] args) {
        int length_args = args.length;
        if (length_args == 3) {
            String footballer_name = args[0];
            String footballer_nationality = args[1];
            String footballer_club = args[2];
            System.out.println("My favorite football player is " + footballer_name);
            System.out.println("His nationality is " + footballer_nationality);
            System.out.println("His plays for " + footballer_club);
        } else {
            System.out.println("Usage: Footballer <footballer name> <nationality> <club name`>");
        }
    }
}
