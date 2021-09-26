package org.example.ex26;
import java.util.Scanner;
import static org.example.ex26.PaymentCalculator.calculateMonthsUntilPaidOff;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 26 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //get balance
        System.out.print("What is your balance? ");
        String balance = input.nextLine();

        //get apr
        System.out.print("What is the APR on the card (as a percent)? ");
        String apr = input.nextLine();

        //get monthly
        System.out.print("What is the monthly payment you can make? ");
        String monthly = input.nextLine();

        //send to calculator
        calculateMonthsUntilPaidOff(balance, apr, monthly);

    }
}