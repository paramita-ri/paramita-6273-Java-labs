package ritidet.paramita.lab3;

import java.util.Random;
import java.util.Scanner;

public class SicBoMethods {
    public static void main(String[] args) {
        playGame(getChioce());
    }

    static int getChioce() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Choose how do you want to bet :\nType 1 for choosing high or low numbers.\nType 2 for choosing number between 1-6.");
        System.out.print("Enter yourchoice:");
        int chioce = scanner.nextInt();
        return chioce;
    }

    static void playGame(int chioce) {
        if (chioce == 1) {
            String type_high_or_low;
            Scanner highLow = new Scanner(System.in);
            System.out.print("Type in h for high and l for low: ");
            type_high_or_low = highLow.nextLine();
            highLow.close();
            int min = 1;
            int max = 6;
            int dice1 = min + (int) (Math.random() * ((max - min) + 1));
            int dice2 = min + (int) (Math.random() * ((max - min) + 1));
            int dice3 = min + (int) (Math.random() * ((max - min) + 1));
            int total = dice1 + dice2 + dice3;
            if (type_high_or_low.toLowerCase().contains("h")) {
                System.out.println("Dice 1 : " + dice1 + " Dice 2 : " + dice2 + " Dice 3 : " + dice3);
                System.out.println("Total is " + total);
                if (total >= 11 && total <= 18) {
                    System.out.println("You win 20 Bath.");
                } else {
                    System.out.println("You loose 10 Bath.");
                }
            } else if (type_high_or_low.toLowerCase().contains("l")) {
                System.out.println("Dice 1 :" + dice1 + " Dice 2 :" + dice2 + " Dice 3 :" + dice3);
                System.out.println("Total is " + total);
                if (total >= 3 && total <= 10) {
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
            int min = 1;
            int max = 6;
            int dice1 = min + (int) (Math.random() * ((max - min) + 1));
            int dice2 = min + (int) (Math.random() * ((max - min) + 1));
            int dice3 = min + (int) (Math.random() * ((max - min) + 1));
            if (chioce_number >= 1 && chioce_number <= 6) {
                System.out.println("Dice 1 :" + dice1 + " Dice 2 :" + dice2 + " Dice 3 :" + dice3);
                if (chioce_number == dice1) {
                    if (chioce_number == dice2) {
                        if (chioce_number == dice3) {
                            System.out.println("You win 90 Bath.");
                        } else {
                            System.out.println("You win 60 Bath.");
                        }
                    } else if (chioce_number == dice3) {
                        System.out.println("You win 60 Bath.");
                    }
                } else if (chioce_number == dice2) {
                    if (chioce_number == dice3) {
                        System.out.println("You win 60 Bath.");
                    } else {
                        System.out.println("You win 30 Bath.");
                    }
                } else if (chioce_number == dice3) {
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
