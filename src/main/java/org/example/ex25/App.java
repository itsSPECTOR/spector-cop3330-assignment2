package org.example.ex25;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 25 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //function to check if anagram
    static int passwordValidator(String password){

        String characters = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        char[] charPw = password.toCharArray();
        char[] charSpecial = characters.toCharArray();
        int len1, i, pass1 = 0, pass2 = 0, pass3 = 0, pass4 = 0, total = 0;

        //get the length
        len1 = charPw.length;

        //sort chars for compare
        Arrays.sort(charPw);

        //pass1: At least 8 characters?
        if (len1 >= 8){
            pass1 = 1;
        }

        //run through pw array
        for (i=0; i<len1; i++){

            //check if has numbers
            if(Character.isDigit(charPw[i])){
                pass2 = 1;
            }

            //check if has characters
            if(Character.isLetter(charPw[i])){
                if(pass2 == 0) {
                    pass3 = 2;
                }
                if(pass2 == 1) {
                    pass3 = 1;
                }
            }

            //check if has special characters
            for(int j = 0; j<29; j++){
                if(charPw[i] == charSpecial[j]) {
                    pass4 = 1;
                    break;
                }
            }
        }

        //return
        return total = pass1 + pass2 + pass3 + pass4;
    }

    public static void main(String[] args) {

        int i = 1, value = 0;
        String strength = "";

        // scanner
        Scanner input = new Scanner(System.in);

        //infinite loop program
        while (i == 1){

            //get password
            System.out.print("Enter Password: ");
            String inputPassword = input.nextLine();

            //determine strength
            value = passwordValidator(inputPassword);
            switch (value) {
                case 1:
                    strength = " very weak ";
                    break;
                case 2:
                    strength = " weak ";
                    break;
                case 3:
                    strength = " strong ";
                    break;
                case 4:
                    strength = " very strong ";
                    break;
                default:
            }

            //output
            System.out.print("The password " + "'"+ inputPassword + "'" + " is a " + strength + " password.\n");
        }
    }
}
