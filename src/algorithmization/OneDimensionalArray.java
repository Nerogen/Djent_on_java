package algorithmization;

import interfaces.Filler;
import interfaces.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray implements Reader, Filler {

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

        for (int j : array) {
            if (j > 0) numberOfPositive++;
            else if (j < 0) numberOfNegative++;
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

    public int sumElementsWithSimpleNumberIndex(int[] array) {
        int sum = 0;
        int number_of_divisions;

        // 0 and 1 not simple numbers
        for (int i = 2; i < array.length; ++i) {
            number_of_divisions = 0;
            for (int j = 1; j < array.length; ++j) {
                if (i % j == 0) {
                    number_of_divisions++;
                }
            }
            if (number_of_divisions <= 2) {
                sum += array[i];
            }
        }

        return sum;
    }

    public int maxInСhain(int[] array) {
        int max = array[0];
        //situation in task An + An+1 incorrect
        for (int i = 0; i < array.length; ++i) {
            if (i + 1 < array.length) {
                array[i] = array[i] + array[i + 1];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int[] sequenceExcludingMin(int[] array) {
        int min = array[0];
        int count = 0;

        for (int j : array) {
            if (j < min) min = j;
        }

        for (int j : array) {
            if (j == min) {
                count++;
            }
        }

        int[] result = new int[array.length - count];
        count = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == min) {
                count++;
                continue;
            }
            result[i - count] = array[i];
        }

        return result;
    }

    public int theMostCommonNumber(int[] array) {
        int count = 0;
        int prevCount = 0;
        int result = 0;
        for (int k : array) {
            count = 0;
            for (int i : array) {
                if (k == i) {
                    count++;
                }
            }
            if (prevCount < count) {
                prevCount = count;
            }
        }

        for (int k : array) {
            count = 0;
            for (int i : array) {
                if (k == i) count++;
            }
            if (prevCount == count) {
                if (result != 0) {
                    result = Math.min(result, k);
                } else {
                    result = k;
                }
            }
        }

        return result;
    }

    public int[] resizeArray(int[] array) {
        int count = 1;

        for (int i = 2; i < array.length; i += 2) {
            array[count] = array[i];
            count++;
        }

        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }
}
