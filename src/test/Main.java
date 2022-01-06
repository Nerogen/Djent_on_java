package test;


import algorithmization.ArrayOfArrays;
import basic.of.software.code.development.Branching;
import basic.of.software.code.development.LinearProgram;
import basic.of.software.code.development.Loop;

public class Main {

    public static void main(String[] args) {
       ArrayOfArrays form = new ArrayOfArrays();
       System.out.println(form.printElementsWhichMoreThanTheirIndex(form.fillingArrayRandomNumbers()));
    }
}
