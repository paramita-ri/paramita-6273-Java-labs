/**
* This SicBoV4 program is that get choice from playyers to play two game 
* 1.High-Low game 2.three dice game and keeps track of what the player 
* has played and what the results are.This programs has two methods 
* first getChioce() method that accept two arguments to choose the game : 1 or 2
* second  playGame() method that use for play game 
* The functionality of this program is as follows.
* if players choose 1 players will play highlow game with 3 dice :
*   choose the total of number that will be on 3 dice 
*   if total of dice between 3-10 is low .if total of dice between 11-18 is high
*   if players bet correctly he/she wins 20 baht .if players bet incorrectly he/she loose 10 baht
* if players choose 2 players will play choosing number game with 3 dice :
*   choose number between 1-6 that will be on 3 dice
*   if players bets correct one dice he/she wins 30 baht
*   if players bets correct two dice he/she wins 60 baht
*   if players bets correct three dice he/she wins 90 baht
*   if players bets incorrect he/she loose 10 baht
* in game if players input value that not match the conditions program will get input again.
* when players finish game if players press 'a' game will start again , 
* if press other keys game will end.
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 10, 2022
*
**/
package ritidet.paramita.lab4;

import java.util.Scanner;

public class SicBoV4 {
    static int chioce ;
    final static int MAX_INUT = 100 ;
    static String[] gamePlay = new String[MAX_INUT];
    static String[] gameResult = new String[MAX_INUT];
    static String chioce_in_String ;
    final static Scanner input = new Scanner(System.in);
    static int currentINPUT = 0;

    public static void main(String[] args) {
        while (true) {
            getChioce(); // to get value from player 
            playGame(); // to run game
            System.out.print("press A to play again. press the other keys to exits : \n");
            String pressChar = input.next();
            if (!pressChar.equalsIgnoreCase("A")) { // to check if players press the other keys game will exits.
                System.out.println("### Game Play Summary ###");
                for(int i = 0 ; i< currentINPUT ; i++ )
                {
                    System.out.println("Game " + (i+1) + " :");
                    System.out.println(gamePlay[i]);
                    System.out.println(gameResult[i]);
                }
                System.out.println("Good Bye!");
                input.close();
                break;
            }

        }
    }

    static int getChioce() {
        while (true) {
            System.out.println("Choose how do you want to bet:" +
                    "\nType 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6.");
            System.out.print("Enter yourchoice: ");
            chioce_in_String = input.next();
            if(chioce_in_String.matches("[^\\d.]")){
                System.out.println("Enter only 1 or 2:");
            }
            else {
                chioce = Integer.parseInt(chioce_in_String);
                if (chioce != 1 && chioce != 2) {
                    System.out.println("Enter only 1 or 2:");
                } else {
                    break;
                }
            }
        }
        return chioce;
    }

    static void playGame() {
        int min = 1;
        int max = 6;
        int dice1 = min + (int) (Math.random() * ((max - min) + 1));
        int dice2 = min + (int) (Math.random() * ((max - min) + 1));
        int dice3 = min + (int) (Math.random() * ((max - min) + 1));
        if (chioce == 1) {
            while (true) { //  use for get input agian when input not a h or l 
                String type_high_or_low;
                System.out.print("Type in h for high and l for low: ");
                type_high_or_low = input.next();
                int total = dice1 + dice2 + dice3;
                if (type_high_or_low.equalsIgnoreCase("h")
                        || type_high_or_low.equalsIgnoreCase("l")) { // to check input is H and total of dice is high or
                    System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3); // to check input is L and total of dice is low
                    System.out.println("Total is " + total);
                    if ((type_high_or_low.toLowerCase().contains("h") && (total >= 11))
                            || (type_high_or_low.toLowerCase().contains("l") && (total <= 10))) {
                        System.out.println("You win 20 Bath.");
                        gamePlay[currentINPUT] = "You have bet on " + type_high_or_low ;
                        gameResult[currentINPUT] = "You win 20 Bath.";
                        currentINPUT ++ ;

                    } else {
                        System.out.println("You loose 10 Bath.");
                        gamePlay[currentINPUT] = "You have bet on " + type_high_or_low ;
                        gameResult[currentINPUT] = "You loose 10 Bath.";
                        currentINPUT ++ ;
                    }
                    break;
                } else {
                    System.out.println("Incorrect input. Enter h for high and l for low only.");
                }
            }
        } else {
            while (true) { //  use for get input agian when input not a number 1-6
                int chioce_number;
                String chioce_String;
                System.out.print("Type in a number to bet on (1-6): ");
                chioce_String = input.next();
                if (chioce_String.matches("[^\\d.]")) { // to check input is not a number.
                    System.out.println("Incorrect input. Enter a number between 1-6 only.");
                } else {
                    chioce_number = Integer.parseInt(chioce_String);
                    if (chioce_number >= 1 && chioce_number <= 6) { // to check number is 1-6
                        System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3);
                        if (chioce_number == dice1 && chioce_number == dice2 && chioce_number == dice3) {  // to check input is match 3 dice
                            int prize = (10 * 3 * (3 % 5 + 1));
                            System.out.println("You win " + prize + " Bath.");
                            gamePlay[currentINPUT] = "You have bet on " + chioce_String ;
                            gameResult[currentINPUT] = "You win " + prize + " Bath.";
                            currentINPUT ++ ;
                        } else if ((chioce_number == dice1 && (chioce_number == dice2 || chioce_number == dice3))
                                || (chioce_number == dice2 && chioce_number == dice3)) {  // to check input is match 2 dice
                            int prize = (10 * 2 * (3 % 5 + 1));
                            System.out.println("You win " + prize + " Bath.");
                            gamePlay[currentINPUT] = "You have bet on " + chioce_String ;
                            gameResult[currentINPUT] = "You win " + prize + " Bath.";
                            currentINPUT ++ ;
                        } else if (chioce_number == dice1 || chioce_number == dice2 || chioce_number == dice3) { // to check input is match 1 dice
                            int prize = (10 * 1 * (3 % 5 + 1));
                            System.out.println("You win " + prize + " Bath.");
                            gamePlay[currentINPUT] = "You have bet on " + chioce_String ;
                            gameResult[currentINPUT] = "You win " + prize + " Bath.";
                            currentINPUT ++ ;
                        } else {
                            System.out.println("You loose 10 Bath.");
                            gamePlay[currentINPUT] = "You have bet on " + chioce_String ;
                            gameResult[currentINPUT] = "You loose 10 Bath.";
                            currentINPUT ++ ;
                        }
                        break;
                    } else {
                        System.out.println("Incorrect input. Enter a number between 1-6 only.");
                    }
                }  
            }
        }
    }
}
