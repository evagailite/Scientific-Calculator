package homework.oop;

public class Calculations {

    public double sub(double number, double total) {
        return total - number;
    }

    public double add(double number, double total) {
        return total + number;
    }

    public double multi(double number, double total) {
        return total * number;
    }

    public double div(double number, double total) {
        return total / number;
    }

    public double getRadianTangents(double number) {
        return Math.tan(number);
    }

    public double getDegreeTangents(double number) {
        double toRadians = Math.toRadians(number);
        return Math.tan(toRadians);
    }

    public double getRadianCos(double number) {
        return Math.cos(number);
    }

    public double getDegreeCos(double number) {
        double toRadians = Math.toRadians(number);
        return Math.cos(toRadians);
    }

    public double getRadianSin(double number) {
        return Math.sin(number);
    }

    public double getDegreeSin(double number) {
        double toRadians = Math.toRadians(number);
        return Math.sin(toRadians);
    }

    public double getLog(double number) {
        return Math.log10(number);
    }

    public double getExp(double number) {
        return Math.exp(number);
    }

    public double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public long getFactorial(long number) {
        long result = 1;
        for (long j = 2; j <= number; j++) {
            result *= j;
        }
        return result;
    }

}
