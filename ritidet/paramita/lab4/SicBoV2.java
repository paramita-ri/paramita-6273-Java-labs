/**
* This SicBoV2 program is to accept two arguments to choose the game : 1 or 2
* if players choose 1 players will play highlow game with 3 dice :
*   choose the total of number that will be on 3 dice 
*   if total of dice between 3-10 is low .if total of dice between 11-18 is high
*   if players bet correctly players wins 20 baht .if players bet incorrectly players loose 10 baht
* if players choose 2 players will play choosing number game with 3 dice :
*   choose number between 1-6 that will be on 3 dice
*   if players bets correct one dice players wins 10 * 1 * (3 % 5 + 1) baht 
*   if players bets correct two dice players wins 10 * 2 * (3 % 5 + 1) baht
*   if players bets correct three dice players wins 10 * 3 * (3 % 5 + 1) baht
*   if players bets incorrect players loose 10 baht
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

public class SicBoV2 {
    static int chioce;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            getChioce(); // to get value from player 
            playGame(); // to run game
            System.out.print("press A to play again. press the other keys to exits : \n");
            String pressChar = input.next();
            if (!pressChar.equalsIgnoreCase("A")) { // to check if players press the other keys game will exits.
                System.out.println("Good Bye!");
                input.close();
                break;
            }
        }
    }

    static int getChioce() {
        System.out.println("Welcome to ปรมิตา ฤทธิเดช (653040627-3) Game :" +
                "\nType 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice: ");
        chioce = input.nextInt();
        return chioce;
    }

    static void playGame() {
        int min = 1;
        int max = 6;
        int dice1 = min + (int) (Math.random() * ((max - min) + 1));
        int dice2 = min + (int) (Math.random() * ((max - min) + 1));
        int dice3 = min + (int) (Math.random() * ((max - min) + 1));
        if (chioce == 1) {
            String type_high_or_low;
            System.out.print("Type in h for high and l for low: ");
            type_high_or_low = input.next();
            int total = dice1 + dice2 + dice3;
            if (type_high_or_low.equalsIgnoreCase("h") || type_high_or_low.equalsIgnoreCase("l")) { // to check input is H or L
                System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3);
                System.out.println("Total is " + total);
                if ((type_high_or_low.equalsIgnoreCase("h") && (total >= 11)) // to check input is H and total of dice is high or
                        || (type_high_or_low.equalsIgnoreCase("l") && (total <= 10))) { // to check input is L and total of dice is low
                    System.out.println("You win 20 Bath.");
                } else {
                    System.out.println("You loose 10 Bath.");
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }
        } else if (chioce == 2) {
            int chioce_number;
            System.out.print("Type in a number to bet on (1-6): ");
            chioce_number = input.nextInt();

            if (chioce_number >= 1 && chioce_number <= 6) { // to check number is 1-6
                System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3);
                if (chioce_number == dice1 && chioce_number == dice2 && chioce_number == dice3) { // to check input is match 3 dice
                    int prize = (10 * 3 * (3 % 5 + 1));
                    System.out.println("You win " + prize + " Bath.");
                } else if ((chioce_number == dice1 && (chioce_number == dice2 || chioce_number == dice3))
                        || (chioce_number == dice2 && chioce_number == dice3)) { // to check input is match 2 dice
                    int prize = (10 * 2 * (3 % 5 + 1));
                    System.out.println("You win " + prize + " Bath.");
                } else if (chioce_number == dice1 || chioce_number == dice2 || chioce_number == dice3) { // to check input is match 1 dice
                    int prize = (10 * 1 * (3 % 5 + 1));
                    System.out.println("You win " + prize + " Bath.");
                } else {
                    System.out.println("You loose 10 Bath.");
                }

            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
            }
        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }
    }
}
