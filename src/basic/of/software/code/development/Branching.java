package basic.of.software.code.development;

public class Branching {

    public String triangleExist(int firstValue, int secondValue) {
        if (180 - (firstValue + secondValue) <= 0) return "Triangle not exist!";
        return (180 - (firstValue + secondValue) == 90) ? "Triangle exist and it is rectangular!" : "Triangle exist but it is no rectangular!";
    }

}
