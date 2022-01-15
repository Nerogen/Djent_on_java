package test;


import algorithmization.ArrayOfArrays;
import algorithmization.OneDimensionalArray;
import algorithmization.Sort;
import basic.of.software.code.development.Branching;
import basic.of.software.code.development.LinearProgram;
import basic.of.software.code.development.Loop;
import programming.with.classes.Student;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = {1, 5, 9};
        int[] array1 = {9, 9, 10};

        Student[] stud = new Student[2];

        Student a = new Student("Dan", 100, array);
        Student b = new Student("Dan", 3002020, array1);

        stud[0] = a;
        stud[1] = b;

        for(int i = 0; i<stud.length;++i){
            stud[i].print();
        }

    }
}
