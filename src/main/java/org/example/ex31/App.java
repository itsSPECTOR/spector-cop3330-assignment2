package org.example.ex31;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 31 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //function that returns target heart rate
    static double calcHeartRate(Integer age, Integer rhr, Double intensity){

        double target, tense = (intensity / 100.0);
        target = ((((220.0 - age) - rhr) * tense) + rhr);

        return Math.round(target);
    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        int age = 0, rhr = 0, flag = 0, i;
        double intensity = 0;

        //input verification age
        while (flag == 0) {
            System.out.print("What is your age?: ");
            String strAge = input.nextLine();

            //catch non-numerics
            try {
                age = Integer.parseInt(strAge);
                flag = 1;
            }
            catch (NumberFormatException ex) {
                System.out.print("Sorry. That's not a valid input. \n");
            }
        } flag = 0; //reset flag

        //input verification resting=heart-rate
        while (flag == 0) {
            System.out.print("What is your Resting Heart Rate?: ");
            String strRHR = input.nextLine();

            //catch non-numerics
            try {
                rhr = Integer.parseInt(strRHR);
                flag = 1;
            }
            catch (NumberFormatException ex) {
                System.out.print("Sorry. That's not a valid input. \n");
            }
        }

        //format head of table
        System.out.print("Resting Pulse: " + age + " \t Age: " + rhr);
        System.out.print("\n\n");
        System.out.format("%-5s | %-5s %n", "Intensity", "Rate");
        System.out.format("%-9s | %-5s %n", "---------", "-------");

        //print & calculate
        for (i=55; i<96; i=i+5){
            System.out.format("%-9s | %-5s bpm %n", i + "%", calcHeartRate(age,rhr, (intensity + i)));
        }
    }
}