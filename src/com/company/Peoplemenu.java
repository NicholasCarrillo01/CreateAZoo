package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Peoplemenu {

     private Scanner input = new Scanner(System.in);

    //handles people options
    private void managePeople() {

        try {
            //      find out what type of people we need to manage
            System.out.println("are you" +
                    "\n1. an Employee" +
                    "\n2. a Visitor" +
                    "\n3. go back" +
                    "\n4. exit program");

            switch (input.nextInt()) {
                case 1:
//             handle Employee
                    manageEmployee();
                    break;
                case 2:
//            handle visitor
                    break;
                case 3:
//             handle going back to main menu
                    mainMenu();
                    break;
                case 4:
//           handle exiting the program
                default:
//             handle incorrect input
                    System.out.println("that is not a valid entry. please enter a nubmer between 1 and 3");
                    break;
            }
        } catch (InputMismatchException ime) {
//            handle any input that is not an int
            input.nextLine();
            System.out.println("that is not a valid entry. please enter a nubmer between 1 and 3");
        }
    }

















}
