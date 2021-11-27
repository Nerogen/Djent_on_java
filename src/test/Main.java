package test;


import basic.of.software.code.development.LinearProgram;

public class Main {

    public static void main(String[] args) {
        LinearProgram form = new LinearProgram(1,2);
        form.print(form.calculateThirdFormula((int)form.getFirstValue(), (int)form.getSecondValue()));
    }
}
