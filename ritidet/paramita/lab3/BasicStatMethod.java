/**
* This BasicStat program is the program that will find the minimum, the maximum, the average,
* the median, and the standard deviation of the list of numbers entered
* Its output format is 
* "Sorted numbers are <Sorted of numbers>
* Minimum: <Minimum of numbers>
* Maximum: <Maximum of numbers>
* Average: <Average of numbers>
* Median: <Median of numbers>
* Standard deviation: <Standard deviation of numbers> "
*
* Author: Paramita Ritidet
* ID: 653040627-3
* Sec: 1
* Date: December 16, 2022
*
**/
package ritidet.paramita.lab3;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BasicStatMethod {
    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers (separated by spaces): ");
        return scanner.nextLine();

    }

    public static void calculateStat(String num_inputString) {
        String[] num_Strings = num_inputString.split(" ");

        if (num_Strings.length >= 1 && num_Strings.length <= 10) {
            double[] num_list = new double[num_Strings.length];
            for (int i = 0; i < num_Strings.length; i++) {
                num_list[i] = Double.parseDouble(num_Strings[i]);
            }
            Arrays.sort(num_list);
            double min = num_list[0];
            double max = num_list[num_list.length - 1];
            double sum = 0;
            for (double num : num_list) {
                sum += num;
            }
            double avg = sum / num_list.length;
            double median;
            if (num_list.length % 2 == 0) {
                median = (num_list[num_list.length / 2] + num_list[num_list.length / 2 - 1]) / 2;
            } else {
                median = num_list[num_list.length / 2];
            }
            double sumOfSquares = 0;
            for (double num : num_list) {
                sumOfSquares += Math.pow(num - avg, 2);
            }
            double standard_dev = Math.sqrt(sumOfSquares / num_list.length);
            System.out.print("Sorted numbers are ");
            for (double num : num_list) {
                System.out.print(num + " ");
            }
            System.out.println("\nMinimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Average: " + avg);
            System.out.println("Median: " + median);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Standard deviation: " + df.format(standard_dev));
        } else if (num_Strings.length == 0) {
            System.out.println("please enter at least one number.");
        } else {
            System.out.println("Please enter no more than ten numbers.");
        }
    }
}
