package test;


import algorithmization.ArrayOfArrays;
import algorithmization.OneDimensionalArray;
import algorithmization.Sort;
import basic.of.software.code.development.Branching;
import basic.of.software.code.development.LinearProgram;
import basic.of.software.code.development.Loop;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Sort form = new Sort();
        System.out.println(Arrays.toString(form.bubbleSort(form.fillingArrayRandomNumbers())));

    }
}
