package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        System.out.println("welcome to the zoo");

        System.out.println("please choose an option. " +
                "\n1. manage people  " +
                "\n2. manage Animals " +
                "\n3. manage Inventory " +
                "\n4  exit");


        //Handles user input for navigation
        try {
            switch (input.nextInt()) {
                case 1:
//          manage people
                    managePeople();
                    break;
                case 2:
                    // manage animals
                    manageAnimals();
                    break;
                case 3:
//                manage inventory
                    manageInventory();
                    break;
                case 4:
                    System.out.println("thank you for using the zoo program");
                    System.exit(0);
                default:
//        handle wrong number

                    System.out.println("that is not a valid entry. please enter a nubmer between 1 and 3");

                    mainMenu();
                    break;


            }
        } catch (InputMismatchException ime) {
//        handle if a user puts in something that is not an int
            input.nextLine();
            System.out.println("that is not a valid entry. please enter a number between 1 and 3");
            mainMenu();


        }
    }

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


    private void manageEmployee() {
    }

    //    handles Animal options
    private void manageAnimals() {
    }

    //     handles inventory
    private void manageInventory() {
    }


}

