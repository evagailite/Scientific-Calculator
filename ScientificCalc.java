package homework.oop;

import java.util.Scanner;

public class ScientificCalc {
    private final Scanner scanner = new Scanner(System.in);
    private final MathOperations mathOperations;
    private boolean quit = false;

    public ScientificCalc(MathOperations mathOperations) {
        this.mathOperations = mathOperations;
    }

    public void start() {
        System.out.println("Calculator power button pressed");
        welcomeMessage();
        getCalculations();
    }

    private void welcomeMessage() {
        System.out.println("\nWelcome to the Scientific Calculator");
        System.out.println("====================================");
    }

    private void displayMenu() {
        System.out.println("\nMathematical operations:");
        System.out.println("\t 1 - Addition");
        System.out.println("\t 2 - Subtraction");
        System.out.println("\t 3 - Multiplication");
        System.out.println("\t 4 - Divide");
        System.out.println("\t 5 - Square root");
        System.out.println("\t 6 - Factorial");
        System.out.println("\t 7 - Sin");
        System.out.println("\t 8 - Cos");
        System.out.println("\t 9 - Tan");
        System.out.println("\t 10 - Log");
        System.out.println("\t 11 - Exp");
        System.out.println("\t 12 - Quit the application");
    }

    public void getCalculations() {

        while (!quit) {

            displayMenu();
            System.out.println("\nPlease enter a number from the menu to proceed:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mathOperations.addition();
                    break;
                case 2:
                    mathOperations.subtraction();
                    break;
                case 3:
                    mathOperations.multiplication();
                    break;
                case 4:
                    mathOperations.divide();
                    break;
                case 5:
                    mathOperations.squareRoot();
                    break;
                case 6:
                    mathOperations.factorial();
                    break;
                case 7:
                    mathOperations.trigonometry(Operations.SIN);
                    break;
                case 8:
                    mathOperations.trigonometry(Operations.COS);
                    break;
                case 9:
                    mathOperations.trigonometry(Operations.TAN);
                    break;
                case 10:
                    mathOperations.logarithm();
                    break;
                case 11:
                    mathOperations.exponent();
                    break;
                case 12:
                    powerOff();
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input! Please choose action between numbers 1-12");
                    break;
            }
        }
    }

    private void powerOff() {
        System.out.println("Calculator power button pressed");
        System.out.println("The Scientific Calculator has stopped working!");
    }

}
