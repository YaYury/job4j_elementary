package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax9To5Then9() {
        int result = Max.max(9, 5);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax7To11Then11() {
        int result = Max.max(7, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenMax8To8Then8() {
        int result = Max.max(8, 8);
        assertThat(result, is(8));
    }
}