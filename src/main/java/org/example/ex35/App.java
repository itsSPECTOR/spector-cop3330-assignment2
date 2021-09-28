package org.example.ex35;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 35 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //random gen
        Random randNum = new Random();

        //create ArrayList
        ArrayList<String> names = new ArrayList<String>();

        //for iterative purposes
        String playName = "blank";

        //input loop
        while (playName != ""){
            //add employees
            System.out.print("Enter a number: ");
            playName = input.nextLine();

            //if input is blank, dont add it
            if(playName == "")
                continue;

            //add to array list
            names.add(playName);
        }

        //random num choses winner
        int winner = randNum.nextInt(names.size());

        //print winner
        System.out.print("The winner is... " + names.get(winner) + ".");

    }
}
