package org.example.ex24;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 24 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //function to check if anagram
    static int isAnagram(String string1, String string2){

        char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        int len1, len2, i;

        //get the input length
        len1 = string1.length();
        len2 = string2.length();

        //compare lengths
        if(len1 != len2){
            return 0;
        }

        //sort chars for compare
        Arrays.sort(char1);
        Arrays.sort(char2);

        //run through char array
        for (i=0; i<len2; i++){
            if (char1[i] != char2[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);
        String input1, input2;
        int flag;


        //get prompt
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");

        //get input1
        System.out.print("Enter the first string: ");
        input1 = input.nextLine();

        //get input2
        System.out.print("Enter the second string: ");
        input2 = input.nextLine();

        //get result
        flag = isAnagram(input1, input2);

        //print result
        if (flag == 1){
            System.out.print(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.print(input1 + " and " + input2 + " are not anagrams.");
        }
    }
}