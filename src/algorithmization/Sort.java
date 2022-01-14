package algorithmization;

import interfaces.FillerOneDimensionalArray;
import interfaces.Reader;

import java.util.Random;
import java.util.Scanner;

public class Sort implements FillerOneDimensionalArray, Reader {

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

    public int[] copyTwoArraysInOneSinceIndex(int[] firstArray, int[] secondArray, int number) {
        int helper = 0;

        for (int j = 1; j < firstArray.length - secondArray.length; ++j) {
            if (number + j < firstArray.length) {
                helper = firstArray[number + j];
            }
            if (number + j + secondArray.length < firstArray.length) {
                firstArray[number + j + secondArray.length] = helper;
            }
        }

        for (int j = 0; j < secondArray.length; ++j) {
            firstArray[number + j + 1] = secondArray[j];
        }

        return firstArray;
    }

    public int[] getNewSequence(int[] firstArray, int[] secondArray) {
        int size = Math.min(firstArray.length, secondArray.length);

        for (int i = 0; i < size; ++i) {
            firstArray[i] = Math.min(firstArray[i], secondArray[i]);
        }

        return firstArray;
    }

    public int[] selectionSort(int[] array) {
        int max = array[0];
        int helperSwap = 0;
        int index = 0;

        for (int i = 0; i < array.length; ++i) {
            max = 0;
            for (int j = i; j < array.length; ++j) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            if (array[i] < max) {
                helperSwap = array[i];
                array[i] = max;
                array[index] = helperSwap;
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        int temp;
        int numberOfSwaps = 0;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    numberOfSwaps++;
                }
            }
        }

        return array;
    }

    //first: sequence A1 <= A2 ... <=An  already sorted
    //second: binary search in no sorted sequence doesn't make sense
    public int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                int j = 0;
                for (j = i - 1; j >= 0 && (temp < array[j]); j--)
                    array[j + 1] = array[j];
                array[j + 1] = temp;
            }
        }

        return array;
    }

    private int binarySearch(int[] array, int value) {
        int index = 0;

        boolean flag = false;
        int left = 0;
        int right = array.length;
        int mid;

        while ((left <= right) && (!flag)) {
            mid = (left + right) / 2;

            if (array[mid] == index) flag = true;
            if (array[mid] > index) right = mid - 1;
            else left = mid + 1;
        }

        return index;
    }

    public int[] shellSort(int[] array) {

        for (int i = 0; i < array.length; ++i) {

        }

        return array;
    }

}
