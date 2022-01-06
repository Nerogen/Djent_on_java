package interfaces;


public interface Printer {
    <T> void print(T data);

    void printTimeInSomeFormat(int value);
}
