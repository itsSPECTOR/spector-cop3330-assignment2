package org.example.ex33;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 33 Solution
 * Copyright 2021 Reese Spector
 *
 */


public class App {

    static void resultGen(Integer randNum){

        //function to generate random response.
        switch (randNum){
            case 1:
                System.out.print("\nYes.");
                break;
            case 2:
                System.out.print("\nNo.");
                break;
            case 3:
                System.out.print("\nMaybe.");
                break;
            case 4:
                System.out.print("\nAsk again later.");
                break;
            default:
                System.out.print("\nYes.");
                break;
        }
    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //random num gen
        Random randomNum = new Random();

        //prompt
        System.out.print("What's your question?\n> ");
        String strScam = input.nextLine();

        //gen & print random response
        resultGen(randomNum.nextInt(5));

    }
}
