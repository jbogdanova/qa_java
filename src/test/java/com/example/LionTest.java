package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LionTest {
    @Test
    public void lionUnknownSexThrowException() {
        assertThrows(Exception.class, () -> new Lion("Лев", null));
    }

    @Test
    public void getKittensDefaultValue() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodForLionReturnPredatorEat() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        String[] expectedResult = new String[]{"Животные", "Птицы", "Рыба"};
        assertArrayEquals(expectedResult, lion.getFood().toArray());
    }
}
