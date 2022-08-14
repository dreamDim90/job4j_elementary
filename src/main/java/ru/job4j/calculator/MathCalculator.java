package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double minusAndQuotient(double first, double second) {
        return minus(first, second)
                + quotient(first, second);

    }

    public static double sumAndMultiplyAndMinusAndQuotient(double first, double second) {
        return minus(first, second)
                + quotient(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndQuotient(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndMinusAndQuotient(10, 20));
    }
}
