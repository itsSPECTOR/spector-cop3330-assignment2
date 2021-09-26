package org.example.ex34;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //array of employees
        String[] employees = {"John Smith", "Smith JohnBerg", "Berg Johnson", "Mike Bergonson", "James Shawn"};

        //print # of employees
        System.out.print("There are "+ employees.length + " employees:\n");

        //print employees
        for (int i = 0; i < employees.length; i++){
            System.out.print(employees[i] + "\n");
        }

        //print # of employees
        System.out.print("\nEnter an employee name to remove: ");
        String remName = input.nextLine();

        //print new list of employees
        for (int i = 0; i < employees.length; i++){

            if (employees[i].contains(remName))
                employees[i] = "";

            System.out.print(employees[i] + "\n");

        }

    }
}
