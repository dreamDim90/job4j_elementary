package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 3, 4, 7);
        double result2 = Point.distance(2, 1, 2, 9);
        double result3 = Point.distance(8, 3, 4, 99);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 3) to (4, 7) " + result1);
        System.out.println("result (2, 1) to (2, 9) " + result2);
        System.out.println("result (8, 3) to (4, 99) " + result3);
    }
}
