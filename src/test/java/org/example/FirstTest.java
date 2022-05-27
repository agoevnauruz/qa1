package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firsttest() {
        Assertions.assertTrue(3 >= 2);
    }

    @Test
    void secondtest() {
        Assertions.assertTrue(4 >= 2);
    }
}