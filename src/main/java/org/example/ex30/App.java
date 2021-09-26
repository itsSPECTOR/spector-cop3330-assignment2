package org.example.ex30;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 30 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {


    public static void main(String[] args) {

        int i = 0, j = 0;

        for (i=1; i<13; i++){

            for(j=1;j<13;j++){

                System.out.format("%4d", i * j);

            }

            System.out.print("\n");

        }

        System.out.print("\n --DONE--");

    }
}
