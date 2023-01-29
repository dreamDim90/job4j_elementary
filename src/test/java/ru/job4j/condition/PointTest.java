package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void when00to02then20() {
        Point cordinate = new Point(0, 0);
        Point another = new Point(0, 2);
        double rsl = cordinate.distance(another);
        double expected = 2.0;
        assertThat(expected).isEqualTo(rsl);
    }
}