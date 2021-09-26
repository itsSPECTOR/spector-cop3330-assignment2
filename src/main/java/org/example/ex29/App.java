package org.example.ex29;

import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 29 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //function to return years
    static double doMath(Double num){
        //quick maths
        double result = Math.round(72 / num);
        return result;
    }

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //inits
        int flag = 0;
        double num = 0;

        //input loop
        while (flag == 0) {
            System.out.print("What is the rate of return? ");
            String strInput = input.nextLine();

                //catch non-numerics
                try {
                    num = Integer.parseInt(strInput);
                    flag = 1;
                }
                catch (NumberFormatException ex) {
                    System.out.print("Sorry. That's not a valid input. \n");
                }

            //check if 0
            if (num == 0) {
                flag = 0;
                System.out.print("Sorry. That's not a valid input. \n");
            }
        }

        //print
        System.out.print("It will take " + doMath(num) + " years to double your initial investment.");

    }
}
