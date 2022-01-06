package algorithmization;


import interfaces.Filler;
import interfaces.Reader;

import java.util.*;

public class ArrayOfArrays implements Reader, Filler {

    @Override
    public int read() {
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    @Override
    public int[] fillingArrayRandomNumbers() {
        System.out.print("Input size of array: ");
        int sizeOfArray = read();
        System.out.print("Input range of numbers: ");
        int range = read();
        int[] array = new int[sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; ++i) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public int sumElementsWhichDivisibleOnSomeNum(int[] array) {
        System.out.print("Input some divider: ");
        int divider = read();
        int sum = 0;

        for (int i : array) {
            if (i % divider == 0) sum += i;
        }
        return sum;
    }

    public int numberOfReplacement(int[] array) {
        System.out.print("Input number: ");
        int number = read();
        int numberOfReplacement = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] > number) {
                numberOfReplacement++;
                array[i] = number;
            }
        }
        System.out.println(Arrays.toString(array));
        return numberOfReplacement;
    }

    public ArrayList<String> getNumOfElementsWithDifferSign(int[] array) {
        int numberOfPositive = 0;
        int numberOfNegative = 0;
        int numberOfNulls = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] > 0) numberOfPositive++;
            else if (array[i] < 0) numberOfNegative++;
            else numberOfNulls++;
        }

        ArrayList<String> result = new ArrayList<String>();
        result.add("Number of positive elements: " + numberOfPositive);
        result.add("Number of negative elements: " + numberOfNegative);
        result.add("Number of nulls: " + numberOfNulls);
        return result;
    }

    public int[] swapLargestAndSmallest(int[] array) {
        int max = array[0];
        int indexMaxPlace = 0;
        int min = array[0];
        int indexMinPlace = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
                indexMinPlace = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMaxPlace = i;
            }
        }

        array[indexMaxPlace] = min;
        array[indexMinPlace] = max;

        return array;
    }

    public ArrayList<Integer> printElementsWhichMoreThanTheirIndex(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > i) list.add(array[i]);
        }

        return list;
    }


}
