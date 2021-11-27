package basic.of.software.code.development;

import interfaces.Printer;
import interfaces.Reader;

import java.util.Scanner;

public class LinearProgram implements Reader, Printer {

    private double firstValue;
    private double secondValue;
    private double thirdValue;

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public double getThirdValue() {
        return thirdValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setThirdValue(double thirdValue) {
        this.thirdValue = thirdValue;
    }

    public LinearProgram() {
        firstValue = 0;
        secondValue = 0;
        thirdValue = 0;
    }

    public LinearProgram(double firstValue) {
        this.firstValue = firstValue;
    }

    public LinearProgram(double firstValue, double secondValue) {
        this(firstValue);
        this.secondValue = secondValue;
    }

    public LinearProgram(double firstValue, double secondValue, double thirdValue) {
        this(firstValue, secondValue);
        this.thirdValue = thirdValue;
    }

    @Override
    public void read() {
        Scanner console = new Scanner(System.in);
        System.out.print("Input first value: ");
        firstValue = console.nextDouble();
        System.out.print("Input second value: ");
        secondValue = console.nextDouble();
        System.out.print("Input third value: ");
        thirdValue = console.nextDouble();
    }

    @Override
    public void print(double result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void print(long result) {
        System.out.println("Result: " + result);
    }

    public double firstFormula(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public double secondFormula(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Dividing by zero!");
            return 0;
        } else {
            return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
    }

    public double thirdFormula(int x, int y) {
        if (Math.cos(x) - Math.sin(y) == 0) {
            System.out.println("Dividing by zero!");
            return 0;
        } else {
            return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        }
    }

    public double swapWholeAndFractionalPartsWithDoubleType(double number) {
        double wholePart;
        double fractionPart;

        wholePart = (int) number;
        fractionPart = number - wholePart;
        wholePart /= 1000;
        fractionPart *= 1000;
        return wholePart + fractionPart;
    }
}
