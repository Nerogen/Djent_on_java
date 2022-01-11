package test;


import algorithmization.ArrayOfArrays;
import algorithmization.OneDimensionalArray;
import basic.of.software.code.development.Branching;
import basic.of.software.code.development.LinearProgram;
import basic.of.software.code.development.Loop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       ArrayOfArrays form = new ArrayOfArrays();
        System.out.println(form.positiveElementsOnMainDiagonal(form.fillingArrayOfArraysRandomNumbers()));
    }
}
