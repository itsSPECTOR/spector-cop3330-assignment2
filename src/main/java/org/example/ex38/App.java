package org.example.ex38;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 38 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    //filter function
    private static void filterEvenNumbers(String[] strSeperated) {

        //filter even numbers by modulo
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for(int i = 0; i<strSeperated.length; i++) {
            int tempNum = Integer.parseInt(strSeperated[i]);
            if((tempNum % 2) == 0)
                numList.add(tempNum);
        }

        //print evens
        System.out.print("The even numbers are ");
        for (int i=0; i<numList.size(); i++)
            System.out.print(numList.get(i) + " ");
    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in).useDelimiter(" ");

        //how much length
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String strNums  = input.nextLine();
        String[] strSeperated = strNums.split(" ");

        //call filter function
        filterEvenNumbers(strSeperated);

    }
}
