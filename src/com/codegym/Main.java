package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Print the square triangle at top-left");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* * ");
                    System.out.println("* \n");
                    System.out.println("Print the square triangle at botton-left");
                    System.out.println("*  ");
                    System.out.println("* *  ");
                    System.out.println("* * * ");
                    System.out.println("* * * *");
                    System.out.println("* * * * *");
                    System.out.println("Print the square triangle at botton-right");
                    System.out.println("        * ");
                    System.out.println("      * * ");
                    System.out.println("    * * * ");
                    System.out.println("  * * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("Print the square triangle at top-right");
                    System.out.println("* * * * *  ");
                    System.out.println("  * * * *  ");
                    System.out.println("    * * *  ");
                    System.out.println("      * *  ");
                    System.out.println("        *  ");
                    break;

                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("      *  ");
                    System.out.println("     * *  ");
                    System.out.println("    * * * ");
                    System.out.println("  * * * * *");
                    System.out.println("* * * * * * *");
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
