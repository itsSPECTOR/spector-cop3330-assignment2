package org.example.ex36;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 36 Solution
 * Copyright 2021 Reese Spector
 *
 */

import static java.util.Collections.max;

public class App {

    private static void average(ArrayList<Integer> stats) {

        double avgNum = 0.0, total = 0.0;

        //loop to sum arraylist
        for (int i=0; i<stats.size(); i++)
            total = total + stats.get(i);

        //math + print
        avgNum = total / stats.size();
        System.out.print("\nThe average is " + Math.round(avgNum));

    }

    private static void min(ArrayList<Integer> stats) {

        double min = stats.get(0);

        //loop to find min
        for (int i=0; i<stats.size(); i++){
            if (stats.get(i) < min)
                min = stats.get(i);
        }

        System.out.print("\nThe minimum is " + Math.round(min));
    }

    private static void max(ArrayList<Integer> stats) {

        double max = stats.get(0);

        //loop to find max
        for (int i=0; i<stats.size(); i++){
            if (stats.get(i) > max)
                max = stats.get(i);
        }

        System.out.print("\nThe maximum is " + Math.round(max));
    }

    private static void std(ArrayList<Integer> stats) {

        double addNum = 0.0, stdDev = 0.0, total = 0;

        //get mean / avg
        for (int i=0; i<stats.size(); i++)
            addNum += stats.get(i);
        double numMean = addNum/stats.size();

        //calc inner operation
        for (int i=0; i<stats.size(); i++)
            stdDev += Math.pow(stats.get(i) - numMean, 2);

        //square root
        total = Math.sqrt(stdDev / stats.size());

        //print
        System.out.print("\nThe standard deviation is " + total);
    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //create ArrayList
        ArrayList<Integer> stats = new ArrayList<Integer>();

        //for iterative purposes
        String userInput = "";
        int userNum = 0;

        //input loop
        while (!userInput.contains("done")){

            //add numbers
            System.out.print("Enter a name: ");
            userInput = input.nextLine();

            //catch invalid entries
            try {
                if (userInput.contains("done"))
                    continue;
                userNum = Integer.parseInt(userInput);
            }
            catch (NumberFormatException ex) {
                System.out.print("Sorry. That's not a valid input. \n");
            }

            //add to array list
            stats.add(userNum);
        }

        //print numbers
        System.out.print("Numbers: ");
        for (int i = 0; i<stats.size(); i++)
            System.out.print(stats.get(i) + " " );

        //run stats
        average(stats);
        min(stats);
        max(stats);
        std(stats);

    }
}
