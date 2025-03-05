package appli;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a + b;
        assertTrue("a et b positif", calc.add(a, b) == res);

    }

    @org.junit.Test
    public void add_a_negative() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = -5;
        b  = 5;
        res = a + b;
        assertTrue("a negative", calc.add(a, b) == res);

    }
    @org.junit.Test
    public void add_ab_negative() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = -5;
        b  = -5;
        res = a + b;
        assertTrue("a and b negative", calc.add(a, b) == res);

    }

    @org.junit.Test
    public void add_b_negative() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = 5;
        b  = -5;
        res = a + b;
        assertTrue("b negative", calc.add(a, b) == res);

    }

    @org.junit.Test
    public void substract() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a - b;
        assertTrue("a et b is subtracted", calc.substract(a, b) == res);


    }

    @org.junit.Test
    public void multiply() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = -2;
        b  = 3;
        res = a * b;
        assertTrue("a and b multiply with the result", calc.multiply(a, b) == res);

    }

    @org.junit.Test
    public void divide() {
        Calculator calc = new Calculator();
        int a, b, res;
        a = 10;
        b  = 2;
        res = a / b;
        assertTrue("a and b divided", calc.divide(a, b) == res);
    }

}