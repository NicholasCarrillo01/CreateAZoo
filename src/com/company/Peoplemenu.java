package com.company;

import com.company.people.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Peoplemenu {

    private Scanner input = new Scanner(System.in);

    //handles people options
    protected void managePeople() {

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
                    manageVisitor();
                    break;
                case 3:
//             handle going back to main menu
                    Menu menu = new Menu();
                    menu.mainMenu();

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
            managePeople();
        }
    }

    private void manageVisitor() {

        System.out.println("you are in the employee menu" +
                "\nwhat would you like to do" +
                "\n1. Create a new visitor" +
                "\n2. view all visitor" +
                "\n3. remove an visitor" +
                "\n4. edit an visitor" +
                "\n5. go back" +
                "\n6. exit program");
        try {
            switch (input.nextInt()) {
                case 1:
//
                    break;
                case 2:
//                    view all visitors
                    break;
                case 3:
//                    remove visitors
                    break;
                case 4:
//                    edit visitor
                    break;
                case 5:
//                     go back
                    manageVisitor();
                    break;
                case 6:
//                    exit program
                    manageVisitor();
                    break;
                default:
//                     handle if an incorrect number
                    System.out.println("that is not a valid entry. please enter a number between 1 and 6");
                    manageVisitor();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("that is not a valid entry. please enter a number between 1 and 6");
            manageVisitor();

        }

        private void createPerson ( int location){

//        if location == 1, new employee, if location ==, new visitor
            if (location == 1) {

               System.out.println("what is the employees age?");
                int employeeAge = input.nextInt();
                input.nextLine();
                System.out.println("what is the employees name?");
                String employeeName = input.nextLine();
                System.out.println("what gender is the employye?");
                char employeeGender = input.nextLine().charAt();
                System.out.println("what is the employees race?");
                String employeeRace = input.nextLine();
                System.out.println("what is the employee number?");
                int employeeNumber = input.nextInt();
                input.nextLine();
                System.out.println("what is the employees job title?");
                String employeeTitle = input.nextLine();
                System.out.println("what is the employees hire date?");
                String employeeHireDate = input.nextLine();



                Employee newEmployee = new Employee(employeeAge, employeeName, employeeGender,
                        employeeRace, employeeNumber,  employeeTitle, employeeHireDate);

            } else if (location == 2) {

        }
    }

    private void manageEmployee() {

        System.out.println("you are in the employee menu" +
                "\nwhat would you like to do" +
                "\n1. Create a new employee" +
                "\n2. view all employees" +
                "\n3. remove an employee" +
                "\n4. edit an employee" +
                "\n5. go back" +
                "\n6. exit program");
        try {
            switch (input.nextInt()) {
                case 1:
//
                   createPerson ();

                    break;
                case 2:
//                    view all employees
                    break;
                case 3:
//                    remove employees
                    break;
                case 4:
//                    edit employee
                    break;
                case 5:
//                     go back
                    manageEmployee();
                    break;
                case 6:
//                    exit program
                    manageEmployee();
                    break;
                default:
//                     handle if an incorrect number
                    System.out.println("that is not a valid entry. please enter a nubmer between 1 and 6");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("that is not a valid entry. please enter a nubmer between 1 and 6");
            manageEmployee();

        }
    }
}
