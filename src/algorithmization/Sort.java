package algorithmization;

import interfaces.FillerOneDimensionalArray;
import interfaces.Reader;

import java.util.*;

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
        int max;
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
                swap(array, i, index);
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        int numberOfSwaps = 0;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                    numberOfSwaps++;
                }
            }
        }

        return array;
    }

    //first: binary search in no sorted sequence doesn't make sense
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
        int count = 1;

        while (count != 0) {
            count = 0;
            for (int i = 0; i < array.length; ++i) {
                if ((i + 1 < array.length) && (array[i] > array[i + 1])) {
                    swap(array, i, i + 1);
                    i--;
                    count++;
                }
            }
        }

        return array;
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    private void swap(String[] array, int firstIndex, int secondIndex) {
        String tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    //equal numbers not insert one more time
    public HashMap<String, String> placeWhereNeedToInsertNewNumbers(int[] firstArray, int[] secondArray) {
        HashMap<String, String> result = new HashMap<>();
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        for (int i = 0; i < firstArray.length; ++i) {
            for (int j = 0; j < secondArray.length; ++j) {
                if (firstArray[i] < secondArray[j]) {
                    result.put("Insert on place number from first array: " + firstArray[i], "Position in second array: " + j);
                    break;
                }
            }
        }
        return result;
    }

    public String[] leadToCommonDenominator(int[] numerator, int[] denominator) {
        String[] result = new String[numerator.length];
        int maxDenominator = 1;
        int multiplier = 0;

        for (int i = 0; i < denominator.length; ++i) {
            maxDenominator *= denominator[i];
        }

        for (int i = 0; i < denominator.length; ++i) {
            multiplier = maxDenominator / denominator[i];
            numerator[i] *= multiplier;
            result[i] = (numerator[i] + " / " + maxDenominator);
        }

        for (int i = 0; i < numerator.length; ++i) {
            for (int j = 0; j < numerator.length; ++j) {
                if (numerator[i] < numerator[j]) {
                    swap(numerator, i, j);
                    swap(result, i, j);
                }
            }
        }

        return result;
    }
}
