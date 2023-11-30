package org.example;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
    public double mul(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
    public double square(double a) {
        return a * a;
    }
    public double squareRoot(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
    }
    public double cube(double a) {
        return a * a * a;
    }
    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate factorial of a negative number");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
