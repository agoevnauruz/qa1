package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firsttest() {
        Assertions.assertFalse(3 < 2);
    }

    @Test
    void secondtest() {
        Assertions.assertFalse(4 < 2);
    }
}
