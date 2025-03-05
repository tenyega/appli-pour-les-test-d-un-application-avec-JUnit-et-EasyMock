package appli;

public class MockCalculator implements ICalculator {
    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        return 0;
    }

    @Override
    public int add(int a, int b) {
        return 5;
    }

    @Override
    public int substract(int a, int b) {
        return -5;
    }
}
