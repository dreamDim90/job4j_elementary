package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to00then3() {
        double expected = 3;
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when83to499then4() {
        double expected = 96.084;
        int x1 = 8;
        int y1 = 3;
        int x2 = 4;
        int y2 = 99;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}