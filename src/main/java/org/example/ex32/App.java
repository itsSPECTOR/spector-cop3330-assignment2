package org.example.ex32;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 32 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //function to give hints
    static String hotCold(Integer guess, Integer randomNumber){

        //init string
        String hint;

        //hint logic
        if (guess < randomNumber)
            return hint = "Too low. Guess again: ";
        else
            return hint = "Too high. Guess again: ";
    }

    //function to determine difficulty
    static Integer difCalc(Integer diff){

        int difConstraint;

        switch (diff){
            case 1:
                difConstraint = 11;
                break;
            case 2:
                difConstraint = 101;
                break;
            case 3:
                difConstraint = 1001;
                break;
            default:
                difConstraint = 11;
                break;
        }
        return difConstraint;
    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //random class
        Random randNum = new Random();

        //inits
        int flag = 0, flagTwo = 1, guess = 0, difficulty = 0, gameNum, count = 0;
        String state = "y", strguess = "";

        //game logic
        while (state.contains("y")) {

            System.out.print("Let's play Guess the Number!\n\n");

            //invalid input catch : difficulty
            while (flag == 0) {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                String strDif = input.nextLine();

                //catch non-numerics
                try {
                    difficulty = Integer.parseInt(strDif);
                    break;
                }
                catch (NumberFormatException ex) {
                    strDif = "";
                    System.out.print("Sorry. That's not a valid input. \n");
                } flag = 0;
            }

            //set difficulty
            gameNum = randNum.nextInt(difCalc(difficulty));

            System.out.print("I have my number. What's your guess? ");

                //guess logic
                while (guess != gameNum){

                    //invalid input catch : guess
                    while (flag == 0) {
                        strguess = input.nextLine();

                        //catch non-numerics
                        try {
                            guess = Integer.parseInt(strguess);
                            //give hints
                            if(guess != gameNum)
                                System.out.print(hotCold(guess, gameNum));
                            break;
                        }
                        catch (NumberFormatException ex) {
                            strguess = "";
                            System.out.print("Sorry. That's not a valid input. \n");
                            count++;
                        } flag = 0;
                    }

                    //keep track of tries
                    count++;
                }

            //print when win
            System.out.print("\nYou got it in " + count + " guesses!\n\n");

            //replay? prompt
            System.out.print("Do you wish to play again? (Y/N) ");
            state = input.nextLine();

        }


    }
}
