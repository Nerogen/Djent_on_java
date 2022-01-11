package algorithmization;


import interfaces.FillerArrayOfArrays;
import interfaces.Printer;
import interfaces.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOfArrays implements Reader, Printer, FillerArrayOfArrays {

    @Override
    public int[][] fillingArrayOfArraysRandomNumbers() {
        System.out.print("Input number of strings: ");
        int numberOfStrings = read();
        System.out.print("Input number of columns: ");
        int numberOfColumns = read();
        System.out.print("Input range of numbers: ");
        int range = read();
        Random random = new Random();
        int[][] array = new int[numberOfStrings][numberOfColumns];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = random.nextInt(range);
            }
        }
        return array;
    }

    @Override
    public int read() {
        Scanner console = new Scanner(System.in);
        return console.nextInt();
    }

    @Override
    public void print(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printAllOddColumns(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 1; j < array[i].length; j += 2) {
                if (array[0][j] < array[array.length - 1][j]) {
                    continue;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printElementsWhichPlaceOnMainDiagonal(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i][i] + " ");
        }
    }

    public void printSomeStringAndColumn(int[][] array, int string, int column) {
        print(array);
        System.out.println("String " + string + ": ");
        for (int j = 0; j < array[string].length; ++j) {
            System.out.print(array[string][j] + " ");
        }
        System.out.println();
        System.out.println("Column " + column + ": ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i][column] + " ");
        }
    }

    public int[][] craftSomeMatrixFirst(int number) {
        int[][] array = new int[number][number];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = number - j;
                }
            }
        }
        return array;
    }

    public int[][] craftSomeMatrixSecond(int number) {
        int[][] array = new int[number][number];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length - i; ++j) {
                array[i][j] = 1 + i;
            }
        }
        return array;
    }

    public int[][] craftSomeMatrixThird(int number) {
        int[][] array = new int[number][number];
        for (int i = 0; i < array.length; ++i) {
            for (int j = i; j < array[i].length - i; ++j) {
                array[i][j] = 1;
                array[array.length - (i + 1)][array.length - (j + 1)] = 1;
            }
        }
        return array;
    }

    public int craftSomeMatrixFourth(int number) {
        double[][] array = new double[number][number];
        int count = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = i; j < array[i].length - i; ++j) {
                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / number);
            }
        }

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] >= 0) count++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return count;
    }

    public int[][] swapTwoColumns(int[][] array, int first, int second) {
        int swapHelper = 0;

        for (int i = 0; i < array.length; ++i) {
            swapHelper = array[i][first];
            array[i][first] = array[i][second];
            array[i][second] = swapHelper;
        }

        return array;
    }

    public ArrayList<String> sumColumnsAndMaxSum(int[][] array) {
        ArrayList<String> result = new ArrayList<String>();
        int sum;
        int max = 0;
        for (int i = 0; i < array.length; ++i) {
            sum = 0;
            for (int j = 0; j < array[i].length; ++j) {
                sum += array[j][i];
            }
            if (max < sum) max = sum;
            result.add("Sum elements of column " + i + " : " + sum);
        }
        result.add("Max sum: " + max);

        return result;
    }

    public ArrayList<Integer> positiveElementsOnMainDiagonal(int[][] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < array.length; ++i) {
            if (array[i][i] >= 0) {
                result.add(array[i][i]);
            }
        }

        return result;
    }


}

