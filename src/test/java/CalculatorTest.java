package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.sub(5.0, 3.0), 0.0001);
    }

    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        assertEquals(15.0, calculator.mul(3.0, 5.0), 0.0001);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.div(6.0, 3.0), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        calculator.div(6.0, 0.0);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        assertEquals(25.0, calculator.square(5.0), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfNegative() {
        Calculator calculator = new Calculator();
        calculator.squareRoot(-25.0);
    }

    @Test
    public void testCube() {
        Calculator calculator = new Calculator();
        assertEquals(125.0, calculator.cube(5.0), 0.0001);
    }

    @Test
    public void testCubeRoot() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.cubeRoot(27.0), 0.0001);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegative() {
        Calculator calculator = new Calculator();
        calculator.factorial(-5);
    }
    @Test
    public void testAddWithLargeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(10000000000.0, calculator.add(5000000000.0, 5000000000.0), 0.0001);
    }

    @Test
    public void testSubWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-10.0, calculator.sub(-5.0, 5.0), 0.0001);
    }

    @Test
    public void testMulWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0.0, calculator.mul(3.0, 0.0), 0.0001);
    }

    @Test
    public void testDivWithDecimals() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.div(5.0, 2.0), 0.0001);
    }

    @Test
    public void testSquareOfOne() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.square(1.0), 0.0001);
    }

    @Test
    public void testCubeOfTwo() {
        Calculator calculator = new Calculator();
        assertEquals(8.0, calculator.cube(2.0), 0.0001);
    }

    @Test
    public void testCubeRootOfOne() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.cubeRoot(1.0), 0.0001);
    }

    @Test
    public void testPowerWithNegativeExponent() {
        Calculator calculator = new Calculator();
        assertEquals(0.125, calculator.power(2.0, -3.0), 0.0001);
    }

    @Test
    public void testFactorialOfOne() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.factorial(1));
    }

}
