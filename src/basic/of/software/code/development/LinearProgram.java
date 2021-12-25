package basic.of.software.code.development;

import interfaces.Printer;


import java.util.Stack;

public class LinearProgram implements Printer {
    //private attributes for formulas
    private final int DIVIDER_OR_MULTIPLIER_FOR_TAKE_SOME_PART = 1000;
    private final int DIVIDER_FOR_PROCESS_TIME = 60;

    //implementation interface Printer, for weak connection, we can print not only in console
    @Override
    public void print(double result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void print(long result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void printTimeInSomeFormat(int value) {
        Stack<Integer> stack = new Stack<Integer>();
        stack = printTimeProcessor(value);
        System.out.println("Past tense: "
                + stack.pop() + " Hours | "
                + stack.pop() + " Minutes | "
                + stack.pop() + " Seconds |");
    }

    //first task
    public double calculateFirstFormula(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    //second task
    public double calculateSecondFormula(int a, int b, int c) {
        //if divider = 0, have dividing by zero, must process situation and next tasks has this situation
        if (a == 0) {
            System.out.println("Dividing by zero!");
            return 0;
        } else {
            return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
    }

    //third task
    public double calculateThirdFormula(int x, int y) {
        if (Math.cos(x) - Math.sin(y) == 0) {
            System.out.println("Dividing by zero!");
            return 0;
        } else {
            return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        }
    }

    //fourth task
    public double swapWholeAndFractionalParts(double number) {
        double wholePart;
        double fractionPart;

        wholePart = (int) number;
        fractionPart = number - wholePart;
        wholePart /= DIVIDER_OR_MULTIPLIER_FOR_TAKE_SOME_PART;
        fractionPart *= DIVIDER_OR_MULTIPLIER_FOR_TAKE_SOME_PART;
        return wholePart + fractionPart;
    }

    //function processing input data and share in implemented interface
    private Stack<Integer> printTimeProcessor(int firstValue) {
        Stack<Integer> box = new Stack<Integer>();

        for (int i = 0; i < 2; ++i) {
            int preValue = firstValue;
            int remainderOfTheDivision = 0;
            firstValue /= DIVIDER_FOR_PROCESS_TIME;
            remainderOfTheDivision = firstValue * DIVIDER_FOR_PROCESS_TIME;
            box.push(preValue - remainderOfTheDivision);
        }
        box.push(firstValue);
        return box;
    }

    //last task in this unit
    public boolean pointInDomain(int firstValue, int secondValue) {
        return (!(firstValue == 0 & secondValue == -1) & (((firstValue <= 2 & firstValue >= -2) & secondValue <= 4)
                | ((firstValue <= 4 & firstValue >= -4) & secondValue >= -3)));
    }
}
