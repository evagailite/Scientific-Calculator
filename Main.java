package homework.oop;

public class Main {
    public static void main(String[] args) {

        Calculations calculations = new Calculations();
        MathOperations mathOperations = new MathOperations(calculations);
        ScientificCalc scientificCalc = new ScientificCalc(mathOperations);
        scientificCalc.start();

    }
}
