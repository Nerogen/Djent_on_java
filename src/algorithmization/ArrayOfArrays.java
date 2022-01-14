package algorithmization;


import interfaces.FillerArrayOfArrays;
import interfaces.Printer;
import interfaces.Reader;
import org.w3c.dom.ls.LSOutput;

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

    public ArrayList<Integer> getNumbersStringsWhereNumFiveHasThreeTimes() {
        Random random = new Random();
        int[][] array = new int[10][20];
        ArrayList<Integer> result = new ArrayList<Integer>();
        int count;
        for (int i = 0; i < array.length; ++i) {
            count = 0;
            for (int j = 0; j < array[i].length; ++j) {
                array[i][j] = random.nextInt(15);
                if (array[i][j] == 5) count++;
            }
            if (count == 3) {
                result.add(i);
            }
        }

        print(array);
        return result;
    }

    //bubble sort
    public int[][] sortArrayOfArraysByStringsSimple(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            int temp;
            for (int f = 0; f != array[i].length; ++f) {
                for (int s = 0; s != array[i].length; ++s) {
                    if (array[i][f] < array[i][s]) {
                        temp = array[i][f];
                        array[i][f] = array[i][s];
                        array[i][s] = temp;

                    }
                }
            }
        }
        return array;
    }

    //bubble sort
    public int[][] sortArraysOfArraysByStringsReverse(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            int temp;
            for (int f = 0; f != array[i].length; ++f) {
                for (int s = 0; s != array[i].length; ++s) {
                    if (array[i][f] < array[i][s]) {
                        temp = array[i][f];
                        array[i][f] = array[i][s];
                        array[i][s] = temp;
                    }

                }
            }
        }
        return array;
    }

    //bubble sort
    public int[][] sortArraysOfArraysByColumnsSimple(int[][] array) {
        print(array);
        System.out.println();
        for (int i = 0; i < array.length; ++i) {
            int temp;
            for (int f = 0; f != array[i].length; ++f) {
                for (int s = 0; s != array[i].length; ++s) {
                    if (array[f][i] < array[s][i]) {
                        temp = array[f][i];
                        array[f][i] = array[s][i];
                        array[s][i] = temp;
                    }
                }
            }
        }
        return array;
    }

    //bubble sort
    public int[][] sortArraysOfArraysByColumnsReverse(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            int temp;
            for (int f = 0; f != array[i].length; ++f) {
                for (int s = 0; s != array[i].length; ++s) {
                    if (array[f][i] > array[s][i]) {
                        temp = array[f][i];
                        array[f][i] = array[s][i];
                        array[s][i] = temp;
                    }
                }
            }
        }
        return array;
    }

    public int[][] createRandomArrayOfArrays() {
        Random random = new Random();
        int numberOfStrings = random.nextInt(15);
        int numberOfColumns = random.nextInt(15);
        int[][] array = new int[numberOfStrings][numberOfColumns];

        int count;
        for (int i = 0; i < numberOfColumns; ++i) {
            count = 0;
            for (int j = 0; j < numberOfStrings; ++j) {
                if (count != i) {
                    count++;
                    array[j][i] = 1;
                }
            }
        }

        return array;
    }

    public int[][] findMaxAndReplaceOdd(int[][] array) {
        int max = array[0][0];
        print(array);
        System.out.println();
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if ((j + i) % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }

        return array;
    }

    public int[][] magicSquare() {
        Random random = new Random();
        int size = random.nextInt(15);
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
               array[i][j] = size;
            }
        }
        //cast magic sum ;)
        //not differ numbers
        //int magicSum = (size * size + 1) / 2 * size;
        //int magicConstant = (int) (size * (Math.sqrt(size) + 1)) / 2;

        return array;
    }


}

