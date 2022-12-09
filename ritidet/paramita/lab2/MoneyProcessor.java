/**
* This MoneyProcessor program is to accept Four arguments: number of 1,000 bath Notes, 
*  number of 500 bath Notes, number of 100 bath Notes and number of 20 bath Notes.
*  And Calculate Total of money you have.
*  Its output format is 
*  “Total Money is <Total of money you have>.” 
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 9, 2022
*
**/

package ritidet.paramita.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        int length_args = args.length;
        if (length_args == 4) {
            int num_of_thousand_banknotes = Integer.parseInt(args[0]);
            int num_of_fiveHundred_banknotes = Integer.parseInt(args[1]);
            int num_of_oneHundred_banknotes = Integer.parseInt(args[2]);
            int num_of_twenty_banknotes = Integer.parseInt(args[3]);
            double total = (1000 * num_of_thousand_banknotes) + (500 * num_of_fiveHundred_banknotes)
                    + (100 * num_of_oneHundred_banknotes) + (20 * num_of_twenty_banknotes);
            System.out.println("Total Money is " + total);
        } else {
            System.out.println(
                    "Usage: MoneyProcessor <# of 1,000 bath Notes> <# of 500 bath Notes> <# of 100 bath Notes> <# of 20 bath Notes>");
        }
    }
}
