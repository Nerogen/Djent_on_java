package basic.of.software.code.development;

import interfaces.Reader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Loop implements Reader {

    @Override
    public int read() {
        Scanner console = new Scanner(System.in);
        System.out.print("Input number: ");
        return console.nextInt();
    }

    public int summationLoop() {
        int size = read();
        int sum = 0;
        for (int i = 1; i < size; ++i) {
            sum += i;
        }
        return sum;
    }

    public ArrayList<Integer> functionValueOnSegment(int a, int b, int h) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = a; i < b; i += h) {
            if (i > 2) result.add(i);
            else result.add(-i);
        }
        return result;
    }

    //we assume that the first 100 numbers are counting from zero
    public int summationSquare() {
        int sum = 0;
        for (int i = 0; i < 100; ++i) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    //we assume that the first 200 numbers are counting from one
    public int multiplicationSquare() {
        int resultMultiplication = 1;
        for (int i = 1; i < 201; ++i) {
            resultMultiplication *= Math.pow(i, 2);
        }
        return resultMultiplication;
    }

    public double sumOfRowMembers(double e) {
        double sum = 0;
        for (int i = 0; i < 1000000000; ++i) {
            if ((1 / Math.pow(2, i) + 1 / Math.pow(3, i)) < e) {
                break;
            }
            sum += (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
        }
        return sum;
    }

    public void tableOfCorrespondences() {
        for (int i = 0; i < 256; ++i) {
            System.out.println("|   " + i + "   |   " + (char) i + "    |");
        }
    }

    public void dividersOfNumber(int m, int n) {
        ArrayList<Integer> box = new ArrayList<Integer>();
        for (int i = m; i < n; ++i) {
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) box.add(j);
            }
            System.out.println(box);
            box.clear();
        }
    }

    public HashSet<Integer> inToNumbers(int firstValue, int secondValue) {
        ArrayList<Integer> firstBox = new ArrayList<Integer>();
        ArrayList<Integer> secondBox = new ArrayList<Integer>();
        HashSet<Integer> result = new HashSet<Integer>();

        firstBox = getNumberInList(firstValue);
        secondBox = getNumberInList(secondValue);

        for (int i = 0; i < firstBox.size(); ++i) {
            for (int j = 0; j < secondBox.size(); ++j) {
                if (firstBox.get(i) == secondBox.get(j)) {
                    result.add(firstBox.get(i));
                }
            }
        }
        return result;
    }

    private ArrayList<Integer> getNumberInList(int value) {
        ArrayList<Integer> box = new ArrayList<Integer>();
        while (value > 0) {
            box.add(value % 10);
            value /= 10;
        }
        return box;
    }
}
