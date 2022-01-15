package programming.with.classes;

public class Test2 {
    private int firstNumber;
    private int secondNumber;

    public Test2() {
        firstNumber = 0;
        secondNumber = 0;
    }

    public Test2(int firstNumber) {
        this();
        this.firstNumber = firstNumber;
    }


    public Test2(int firstNumber, int secondNumber) {
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
}
