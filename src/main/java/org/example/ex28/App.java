package org.example.ex28;

import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 28 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //init total
        int total = 0;

        //loop
        for(int i=0; i<=4; i++){

            //loop prompt
            System.out.print("Enter a number: ");
            String strInput = input.nextLine();
            int num = Integer.parseInt(strInput);

            //math
            total = total + num;

        }

        //print
        System.out.print("The total is: " + total);

    }
}
