/**
* This SicBo program is to accept two arguments to choose the game : 1 or 2
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
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 16, 2022
*
**/
package ritidet.paramita.lab3;

import java.util.Random;
import java.util.Scanner;

public class SicBoMethods {
    static int chioce;

    public static void main(String[] args) {
        getChioce();
        playGame();
    }

    static int getChioce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Choose how do you want to bet :\nType 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");
        chioce = scanner.nextInt();
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
            Scanner highLow = new Scanner(System.in);
            System.out.print("Type in h for high and l for low: ");
            type_high_or_low = highLow.nextLine();
            highLow.close();
            int total = dice1 + dice2 + dice3;
            if (type_high_or_low.toLowerCase().contains("h") || type_high_or_low.toLowerCase().contains("l")) {
                System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3);
                System.out.println("Total is " + total);
                if ((type_high_or_low.toLowerCase().contains("h") && (total >= 11))
                        || (type_high_or_low.toLowerCase().contains("l") && (total <= 10))) {
                    System.out.println("You win 20 Bath.");
                } else {
                    System.out.println("You loose 10 Bath.");
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }

        } else if (chioce == 2) {
            int chioce_number;
            Scanner number = new Scanner(System.in);
            System.out.print("Type in a number to bet on (1-6): ");
            chioce_number = number.nextInt();
            number.close();

            if (chioce_number >= 1 && chioce_number <= 6) {
                System.out.println("Dice 1 :" + dice1 + " Dice 2 :" + dice2 + " Dice 3 :" + dice3);
                if (chioce_number == dice1 && chioce_number == dice2 && chioce_number == dice3) {
                    System.out.println("You win 90 Bath.");
                } else if ((chioce_number == dice1 && (chioce_number == dice2 || chioce_number == dice3))
                        || (chioce_number == dice2 && chioce_number == dice3)) {
                    System.out.println("You win 60 Bath.");
                } else if (chioce_number == dice1 || chioce_number == dice2 || chioce_number == dice3) {
                    System.out.println("You win 30 Bath.");
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
