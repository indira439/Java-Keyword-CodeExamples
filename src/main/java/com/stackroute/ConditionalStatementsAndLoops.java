package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class ConditionalStatementsAndLoops {
    public static void main(String[] args) throws InterruptedException {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conditional statements demo...........................................");
        System.out.println("\nEnter input number to check Even or Odd using if-else:");
        inputNumber = scanner.nextInt();

        /**Conditional statements*/

        /**Checking for even or odd using if-else statements*/
        if (inputNumber < 0) {
            System.out.println("Give numbers greater than 0");
        } else if (inputNumber % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("\nEnter input number to print the day using switch case:");
        int day = scanner.nextInt();

        /**Usage of switch case*/
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid input");
        }

        /**Loops*/

        System.out.println("\nLoops demo...............................");
        /**For loop for printing 1 to 10 numbers*/


        /**Thraed.sleep to pause execution*/
        Thread.sleep(100);

        System.out.println("\nPrint numbers from 0 to 10 using for loop");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println(i);
        }

        /**While loop to iterate till 20*/
        System.out.println("\nEnter input less than 20 to print till 20 using while loop:");
        int input = scanner.nextInt();
        while (input <= 20) {
            Thread.sleep(100);
            System.out.println(input);
            input++;
        }

        /**Do While loop to print first 30 integers*/
        Thread.sleep(100);
        System.out.println("\nPrint till 30 using do while loop");
        int inputNum = scanner.nextInt();
        do {
            System.out.println(inputNum);
            inputNum++;
        } while (inputNum <= 30);


        /**For-Each loop to print list of elements
         *
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("indu");
        list.add("shiva");

        Thread.sleep(100);
        System.out.println("\nPrint list elements using for each loop");
        /**Traversing the list of elements using for-each loop*/
        for (String string : list) {
            System.out.println(string);
        }
    }
}
