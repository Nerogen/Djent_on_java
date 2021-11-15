package linary_programs;

import java.util.Scanner;

public class Formulas {

    public void firstFormula() {
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

    public void secondFormula() {
        int a, b, c;
        double result = 0;

        Scanner console = new Scanner(System.in);
        System.out.print("Input a: ");
        a = console.nextInt();
        System.out.print("Input b: ");
        b = console.nextInt();
        System.out.print("Input c: ");
        c = console.nextInt();

        if (a == 0) {
            System.out.println("Dividing by zero!");
        } else {
            result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println("Result: " + result);
        }
    }

    public void thirdFormula() {
        int x, y;
        double result = 0;

        Scanner console = new Scanner(System.in);
        System.out.print("Input x: ");
        x = console.nextInt();
        System.out.print("Input y: ");
        y = console.nextInt();

        if ((Math.cos(x) - Math.sin(y)) == 0) {
            System.out.println("Dividing by zero!");
        } else {
            result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
            System.out.println("Result: " + result);
        }
        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

    }


}
