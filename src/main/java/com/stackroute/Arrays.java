package com.stackroute;

public class Arrays {
    public static void main(String[] args) {

        //Declare and initialize array of integer type
        int[] inputArray = new int[]{1, 2, 3, 4, 5};

        System.out.println("Print array elements");

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }

        /**2D Array*/

        //Declare and initialize 2D Array of integer type
        int[][] inputArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\nPrint 2D array elements");
        for (int i = 0; i < inputArray2.length; i++) {
            for (int j = 0; j < inputArray2.length; j++) {
                System.out.print(inputArray2[i][j] + " ");
            }
            System.out.println();
        }


        //String Array
        String[] inputString;   //Declaring Array
        inputString = new String[4];    //Allocating memory to array

        inputString[0] = "Datta";
        inputString[1] = "Gokul";
        inputString[2] = "Praveen";
        inputString[3] = "Suresh";

        System.out.println("\nPrint elements in string array");
        for(int i=0;i<inputString.length;i++) {
            System.out.println(inputString[i]);
        }


    }
}
