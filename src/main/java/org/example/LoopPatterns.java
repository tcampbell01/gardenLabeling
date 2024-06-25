package org.example;

import java.util.Scanner;

public class LoopPatterns {
        public static void main (String[] args) {
            Scanner scnr = new Scanner(System.in);
            int numRows;
            int numColumns;
            int currentRow;
            int currentRowInteger;
            int currentColumn;
            char currentColumnLetter;

            System.out.println("Please enter the number of rows");
            numRows = scnr.nextInt();
            System.out.println("Please enter the number of columns");
            numColumns = scnr.nextInt();

            for ( currentRow = 1; currentRow <= numRows; currentRow++) {
                for ( currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
                    currentColumnLetter = (char) ('A' + currentColumn - 1);

                    System.out.print(currentRow + "" + currentColumnLetter + " ");
                }
                System.out.println();
            }

            scnr.close();

        }
    }