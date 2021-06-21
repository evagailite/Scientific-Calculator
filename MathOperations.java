package homework.oop;

import java.util.Scanner;

public class MathOperations {
    private final Scanner scanner = new Scanner(System.in);
    private final Calculations calculations;

    private double input;
    private double output;

    public MathOperations(Calculations calculations) {
        this.calculations = calculations;
    }

    public void addition() {
        output = 0;
        System.out.print("Enter a range of numbers for " + Operations.ADDITION + ": ");
        try {
            input = scanner.nextInt();
            for (double i = 0; i < input; i++) {
                System.out.print("Enter number " + ((int) i + 1) + " for " + Operations.ADDITION + ": ");
                double temp = scanner.nextDouble();
                output = calculations.add(temp, output);
            }
            System.out.println("Sum of entered numbers is: " + output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void subtraction() {
        output = 0;
        System.out.print("Enter a range of numbers for " + Operations.SUBTRACTION + ": ");
        try {
            input = scanner.nextInt();
            for (double i = 0; i < input; i++) {
                System.out.print("Enter number " + ((int) i + 1) + " for " + Operations.SUBTRACTION + ": ");
                double temp = scanner.nextDouble();
                if (i == 0) {
                    output = temp;
                } else {
                    output = calculations.sub(temp, output);
                }
            }
            System.out.println("Subtraction of entered numbers is: " + output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void multiplication() {
        output = 1;
        System.out.print("Enter a range of numbers for " + Operations.MULTIPLICATION + ": ");
        try {
            input = scanner.nextInt();
            for (double i = 0; i < input; i++) {
                System.out.print("Enter number " + ((int) i + 1) + " for " + Operations.MULTIPLICATION + ": ");
                double temp = scanner.nextDouble();
                output = calculations.multi(temp, output);
            }
            System.out.println("Multiplication of entered numbers is: " + output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void divide() {
        output = 0;
        System.out.print("Enter a range of numbers for " + Operations.DIVIDE + ": ");
        try {
            input = scanner.nextInt();
            for (double i = 0; i < input; i++) {
                System.out.print("Enter number " + ((int) i + 1) + " for " + Operations.DIVIDE + ": ");
                double temp = scanner.nextDouble();
                if (i == 0) {
                    output = temp;
                } else {
                    output = calculations.div(temp, output);
                }
            }
            System.out.println("The result of the divide from entered numbers is: " + output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void squareRoot() {
        System.out.print("Enter the number for square root value ");
        try {
            input = scanner.nextDouble();
            output = calculations.getSquareRoot(input);
            results(Operations.SQUARE_ROOT, input, output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void factorial() {
        System.out.print("Enter a number to find factorial: ");
        try {
            long input = scanner.nextLong();
            output = calculations.getFactorial(input);
            results(Operations.FACTORIAL, input, output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void trigonometry(Operations operations) {
        System.out.println("Please choose to proceed:");
        System.out.println("1. Calculate the value of " + operations + " in degree.");
        System.out.println("2. Calculate the value of " + operations + " in radian.");
        try {

            int inputOpt = scanner.nextInt();

            //input in degrees
            if (inputOpt == 1) {
                System.out.print("Enter the angle in degrees:");
                input = scanner.nextDouble();

                if (operations.equals(Operations.SIN)) {
                    output = calculations.getDegreeSin(input);
                } else if (operations.equals(Operations.COS)) {
                    output = calculations.getDegreeCos(input);
                } else if (operations.equals(Operations.TAN)) {
                    output = calculations.getDegreeTangents(input);
                }
                System.out.println("The value of " + operations + "(" + input + ") is " + output);

                //input in radians
            } else if (inputOpt == 2) {
                System.out.print("Enter the angle in radians:");
                input = scanner.nextDouble();

                if (operations.equals(Operations.SIN)) {
                    output = calculations.getRadianSin(input);
                } else if (operations.equals(Operations.COS)) {
                    output = calculations.getRadianCos(input);
                } else if (operations.equals(Operations.TAN)) {
                    output = calculations.getRadianTangents(input);
                }
                System.out.println("The value of " + operations + "(" + input + ") is " + output);
            } else {
                System.out.println("Invalid input!");
            }
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void logarithm() {
        System.out.print("Enter log number to calculate logarithm with base 10: ");
        try {
            input = scanner.nextDouble();
            output = calculations.getLog(input);
            results(Operations.LOG, input, output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void exponent() {
        //a − the exponent to raise e to.
        System.out.print("Enter the number for exp value: ");
        try {
            input = scanner.nextDouble();
            output = calculations.getExp(input);
            results(Operations.EXP, input, output);
        } catch (
                Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input!");
        }
    }

    public void results(Operations operations, double input, double output) {
        System.out.println("The value of " + operations + " " + input + " is " + output);
    }

}
