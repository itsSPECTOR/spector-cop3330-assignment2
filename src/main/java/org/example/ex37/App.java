package org.example.ex37;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * UCF COP3330 Fall 2021 Assignment 37 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    static void printPW(Integer min, Integer chars, Integer nums){

        //random gen
        Random randNum = new Random();
        int capNum = (min / 3), capChar = (min / 3), capLet = (min / 3);
        int flag = 0, i = 0, j = 0, k = 0, p = 0;
        int randGen = randNum.nextInt(min);
        int ranPick = 0;
        int randChar = 0, randNumber = 0, randLetter = 0;

        //chars arrayList
        ArrayList<String> charList = new ArrayList<String>();
        charList.add("!"); charList.add("@"); charList.add("#"); charList.add("$");
        charList.add("%"); charList.add("^"); charList.add("&"); charList.add("*");
        charList.add("("); charList.add(")");

        //nums arrayList
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for(i = 0; i<10; i++)
            numList.add(i);

        //letters arrayList
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a"); letters.add("b"); letters.add("c"); letters.add("d");
        letters.add("e"); letters.add("f"); letters.add("g"); letters.add("h");
        letters.add("i"); letters.add("j"); letters.add("k"); letters.add("l");
        letters.add("m");letters.add("n"); letters.add("o"); letters.add("p");
        letters.add("q"); letters.add("r"); letters.add("s"); letters.add("t");
        letters.add("u"); letters.add("v"); letters.add("w"); letters.add("x");
        letters.add("y"); letters.add("z");

        //loop until password done
        while(flag == 0){

            //generate randum nums within bounds for each arrayList
            randChar = randNum.nextInt(10);
            randNumber = randNum.nextInt(10);
            randLetter = randNum.nextInt(25);
            ranPick = randNum.nextInt(4);

            //randomly select the next digit
            switch (ranPick){
                case 1: //random numbers
                    if(k==nums)
                        continue;
                    System.out.print(numList.get(randNumber));
                    j++;
                    break;
                case 2: //random characters
                    if(k==chars)
                        continue;
                    System.out.print(charList.get(randChar));
                    k++;
                    break;
                case 3: //random letters
                    if(capLet == p)
                        continue;
                    System.out.print(letters.get(randLetter));
                    p++;
                    break;
                default:
                    continue;
            }

            //once all digits are evenly distributed, break
            if(j+k+p == min)
                break;
        }

    }

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //how much length
        System.out.print("What's the minimum length? ");
        String strLength = input.nextLine();
        int pwLen = Integer.parseInt(strLength);

        //how much length
        System.out.print("How many special characters? ");
        String strChar = input.nextLine();
        int pwChar = Integer.parseInt(strChar);

        //how much length
        System.out.print("How many numbers? ");
        String strnum = input.nextLine();
        int pwNum = Integer.parseInt(strnum);

        //generate password function
        printPW(pwLen, pwChar, pwNum);

    }
}
