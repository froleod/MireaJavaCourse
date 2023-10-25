package ru.mirea.prak20;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversedPolishNotationTest {

    @Test
    public void RPNTest1() {
        assertEquals(5, ReversedPolishNotation.RPN("2 3 +"));
    }

    @Test
    public void RPNTest2() {
        assertEquals(26, ReversedPolishNotation.RPN("2 3 * 4 5 * +"));
    }

    @Test
    public void RPNTest3() {
        assertEquals(0, ReversedPolishNotation.RPN("2 3 4 5 6 * + - /"));
    }

    @Test
    public void RPNTest4() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> ReversedPolishNotation.RPN("2 3 4 * + -"));
        assertTrue(e.getMessage().contains("Invalid syntax :/"));
    }

    @Test
    public void RPNTestToFail() {
        assertEquals(123, ReversedPolishNotation.RPN("2 3 + 8 *"));
    }

}