package programming.with.classes;

public class Test1 {
    private int firstNumber;
    private int secondNumber;

    public Test1() {
        firstNumber = 0;
        secondNumber = 0;
    }

    public Test1(int firstNumber) {
        this();
        this.firstNumber = firstNumber;
    }


    public Test1(int firstNumber, int secondNumber) {
        this(firstNumber);
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int sumTwoNumbers() {
        return firstNumber + secondNumber;
    }

    public void print() {
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }

    public int getMaxNumber() {
        return Math.max(firstNumber, secondNumber);
    }


}
