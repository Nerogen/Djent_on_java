package Basics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, b, c, z;
        Scanner console = new Scanner(System.in);
        System.out.print("Input a: ");
        a = console.nextFloat();
        System.out.print("Input b: ");
        b = console.nextFloat();
        System.out.print("Input c: ");
        c = console.nextFloat();
        z = ((a - 3) * b / 2) + c;
        System.out.println("Result: " + z);
        System.out.println();
    }
}
