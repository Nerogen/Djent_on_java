package basic.of.software.code.development;

public class Branching {

    public String triangleExist(int firstValue, int secondValue) {
        if (180 - (firstValue + secondValue) <= 0) return "Triangle not exist!";
        return (180 - (firstValue + secondValue) == 90) ? "Triangle exist and it is rectangular!" : "Triangle exist but it is no rectangular!";
    }

    public int maxFromMin(int firstValue, int secondValue, int thirdValue, int fourthValue) {
        return max(min(firstValue, secondValue), min(thirdValue, fourthValue));
    }

    private int min(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return secondValue;
        } else {
            return firstValue;
        }
    }

    private int max(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    //I made the equation a straight line through 2 points and derived the inequality
    public boolean pointsOnOneLine(int x1, int x2, int y1, int y2, int z1, int z2) {
        if ((y2 - y1) * (z1 - x1) - (z2 - y1) * (x2 - x1) == 0) return true;
        return false;
    }

    //how I understand z this long of brick, so we can't input infinity, this statement is not used
    public boolean brickFitIntoTheHole(int width, int height, int x, int y, int z) {
        if (width >= x && height >= y) return true;
        return false;
    }

    public double functionResult(int x) {
        if (x <= 3) {
            return Math.pow(x, 2) * -3 * x + 9;
        } else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
