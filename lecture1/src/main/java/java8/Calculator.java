package java8;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.divide(3, 2);
        System.out.println(result);
    }

    public int divide(int firstOp, int secondOp) {
        if (secondOp == 0) {
            throw new IllegalArgumentException("Zero is not allowed as second argument");
        }
        return firstOp / secondOp;
    }

    public long plus(int x, int y) {
        return (long) x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    //TODO add multiple/divide
}

class ImprovedCalculator extends Calculator {
}

